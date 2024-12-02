// 13 var

import Builder.*;
import Builder.Character;

public class Main {
  public static void main(String[] args) {
    CharacterBuilder humanJohn = new HumanBuilder("John");
    Director director = new Director();
    director.constructWarrior(humanJohn);
    Character warriorJohn = humanJohn.build();
    System.out.println(warriorJohn.toString());

    CharacterBuilder dwarfIgor = new DwarfBuilder("Igor");
    dwarfIgor.buildDefaults().buildAbilities().buildWeapon("Sword").buildArmor("Chaimail").buildClass("Mage");
    Character mageIgor = dwarfIgor.build();
    System.out.println(mageIgor.toString());
  }
}