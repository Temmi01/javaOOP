import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class NumberOperations {
    public static void main(String[] args) {
        List<Object> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9);

        System.out.print("List of numbers: ");
        for (Object number : numbers) {
            System.out.print(number + " ");
        }

        List<Double> numbers00 = new ArrayList<>();
        for (Object num : numbers) {
            Number number = (Number) num;
            numbers00.add(number.doubleValue());
        }

        System.out.print("\nList of fractional numbers: ");
        for (Double num : numbers00) {
            System.out.printf("%.2f", num);
        }

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        for (Object number : numbers) {
            if( number instanceof Integer ) {
                integers.add((Integer)number);
            }
            else if( number instanceof Double ) {
                doubles.add((Double)number);
            }
        }

        System.out.print("\nList of integers: ");
        for (Integer i : integers) {
            System.out.printf("%d ", i);
        }

        System.out.print("\nList of doubles: ");
        for (Double d : doubles) {
            System.out.printf(d + " ");
        }

        Double result = 1.0;
        for (int i = 0; i < 5; i++) {
            result *= numbers00.get(i);
        }
        System.out.printf("\nThe result of multiplication of the first five numbers in the list is: %.0f ", result);
    }
}

