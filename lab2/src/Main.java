// 12 variant
import size.Size;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main() {
    double budget = 100.0;
    Room room = new Room(budget);

    room.showToys();
    System.out.println("Number of toys: " + room.getToys().size());

    Room.sortByPrice(room.getToys());
    System.out.println("\nSorted by price:");
    room.showToys();

    Room.sortByName(room.getToys());
    System.out.println("\nSorted by name:");
    room.showToys();

    ArrayList<Toy> smallToys = Room.getBySize(room.getToys(), Size.SMALL);
    System.out.println("\nToys with size SMALL:");
    smallToys.forEach(toy -> System.out.println(toy.getName() + " " + toy.getSize() + " " + toy.getPrice()));

    ArrayList<Toy> doll = Room.getByType(room.getToys(), "Doll");
    System.out.println("\nDolls:");
    doll.forEach(toy -> System.out.println(toy.getName() + " " + toy.getSize() + " " + toy.getPrice()));

    ArrayList<Toy> priceRange = Room.findByPrice(room.getToys(), 10.0, 20.0);
    System.out.println("\nToys with price range from 10 to 20:");
    priceRange.forEach(toy -> System.out.println(toy.getName() + " " + toy.getSize() + " " + toy.getPrice()));
  }
}

abstract class Toy {
  private final String name;
  private final Size size;
  private final Double price;

  public Toy(String name, Size size) {
    this.name = name;
    this.size = size;
    this.price = makePrice();
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getSize() {
    return size.getAbbreviation();
  }

  protected abstract Map<Size, Double> getPriceMap();

  public double makePrice() {
    return getPriceMap().getOrDefault(size, 0.0);
  }
}

class Car extends Toy {
  public Car(String name, Size size) {
    super(name, size);
  }

  private static final Map<Size, Double> priceMap = new HashMap<>();

  static {
    priceMap.put(Size.SMALL, 10.0);
    priceMap.put(Size.MEDIUM, 20.0);
    priceMap.put(Size.LARGE, 30.0);
  }

  @Override
  protected Map<Size, Double> getPriceMap() {
    return priceMap;
  }
}

class Doll extends Toy {
  public Doll(String name, Size size) {
    super(name, size);
  }

  private static final Map<Size, Double> priceMap = new HashMap<>();

  static {
    priceMap.put(Size.SMALL, 5.0);
    priceMap.put(Size.MEDIUM, 10.0);
    priceMap.put(Size.LARGE, 15.0);
  }

  @Override
  protected Map<Size, Double> getPriceMap() {
    return priceMap;
  }
}

class Ball extends Toy {
  public Ball(String name, Size size) {
    super(name, size);
  }

  private static final Map<Size, Double> priceMap = new HashMap<>();

  static {
    priceMap.put(Size.SMALL, 1.0);
    priceMap.put(Size.MEDIUM, 2.0);
    priceMap.put(Size.LARGE, 3.0);
  }

  @Override
  protected Map<Size, Double> getPriceMap() {
    return priceMap;
  }
}

class Cube extends Toy {
 public Cube(String name, Size size) {
   super(name, size);
  }

  private static final Map<Size, Double> priceMap = new HashMap<>();

  static {
    priceMap.put(Size.SMALL, 5.0);
    priceMap.put(Size.MEDIUM, 10.0);
    priceMap.put(Size.LARGE, 15.0);
  }

  @Override
  protected Map<Size, Double> getPriceMap() {
    return priceMap;
  }
}

class Room {
  protected ArrayList<Toy> toys = new ArrayList<>();
  private int count;
  private double spendMoney = 0;
  private final double price;

  public Room(double price) {
    count = 0;
    this.price = price;
    this.addToys();
  }

  public void addToy(Toy toy) {
    if( toy.getPrice() + this.spendMoney < this.price ){
      this.toys.add(count, toy);
      count++;
      spendMoney += toy.getPrice();
    }
  }

  public void addToys() {
    Toy[] toysToAdd = {
        new Car("Car", Size.SMALL),
        new Doll("Doll", Size.SMALL),
        new Ball("Ball", Size.SMALL),
        new Cube("Cube", Size.SMALL),
        new Car("Car", Size.MEDIUM),
        new Doll("Doll", Size.MEDIUM),
        new Ball("Ball", Size.MEDIUM),
        new Cube("Cube", Size.MEDIUM),
        new Car("Car", Size.LARGE),
        new Doll("Doll", Size.LARGE),
        new Ball("Ball", Size.LARGE),
        new Cube("Cube", Size.LARGE)
    };

    double sum = 0;
    for (Toy toy : toysToAdd) {
      sum += toy.getPrice();
    }

   int n = (int)Math.ceil(this.price / sum);
    for ( int i = 0; i < n; i++ ) {
      for (Toy toy : toysToAdd) {
        this.addToy(toy);
      }
    }
    System.out.println("Room initialized");
  }

  public ArrayList<Toy> getToys() {
    return toys;
  }

  public void showToys() {
    for (Toy toy : this.toys) {
      System.out.println(toy.getName() + " " + toy.getSize() + " " + toy.getPrice());
    }
  }

  public static void sortByPrice(ArrayList<Toy> toys) {
    toys.sort((toy1, toy2) -> Double.compare(toy1.getPrice(), toy2.getPrice()));
  }

  public static void sortByName(ArrayList<Toy> toys) {
    toys.sort((toy1, toy2) -> toy1.getName().compareTo(toy2.getName()));
  }

  public static ArrayList<Toy> getBySize(ArrayList<Toy> toys, Size size) {
    ArrayList<Toy> result = new ArrayList<>();
    for (Toy toy : toys) {
      if (toy.getSize().equals(size.getAbbreviation())) {
        result.add(toy);
      }
    }
    return result;
  }

  public static ArrayList<Toy> getByType(ArrayList<Toy> toys, String type) {
    ArrayList<Toy> result = new ArrayList<>();
    for (Toy toy : toys) {
      if (toy.getClass().getSimpleName().equals(type)) {
        result.add(toy);
      }
    }
    return result;
  }

  public static ArrayList<Toy> findByPrice(ArrayList<Toy> toys, double priceLower, double priceUpper) {
    ArrayList<Toy> result = new ArrayList<>();
    for (Toy toy : toys) {
      if (toy.getPrice() >= priceLower && toy.getPrice() <= priceUpper) {
        result.add(toy);
      }
    }
    return result;
  }
}