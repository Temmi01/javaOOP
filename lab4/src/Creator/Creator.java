package Creator;

import Builder.Character;

public class Creator {
  public static String createRaceAbilities(String race) {
    return switch (race) {
      case "Human" -> "Great social tactician";
      case "Elf" -> "Enchanted magical abilities";
      case "Dwarf" -> "The best technicians";
      case "Ogre" -> "Giant strength";
      default -> "Unknown Abilities";
    };
  }

  public static void createClass(Builder.Character character, String characterClass) {
    switch (characterClass) {
      case "Warrior":
        character.setCharacterClass("Warrior");
        character.addStrength(20);
        character.addHp(30);
        break;
      case "Mage":
        character.setCharacterClass("Mage");
        character.addIntelligence(10);
        character.addMana(40);
        break;
      case "Technician":
        character.setCharacterClass("Technician");
        character.addIntelligence(30);
        break;
      case "Assassin":
        character.setCharacterClass("Assassin");
        character.addStealth(20);
        character.addStrength(10);
        break;
      default:
        character.setCharacterClass("Farmer");
        break;
    }
  };

  public static void createWeapon(Builder.Character character, String weapon) {
    switch (weapon) {
      case "Staff":
        character.setWeapon("Staff");
        character.addMana(15);
        break;
      case "Sword":
        character.setWeapon("Sword");
        character.addAgility(5);
        character.addStrength(5);
        character.addStealth(5);
        break;
      case "Axe":
        character.setWeapon("Axe");
        character.addStrength(15);
        break;
      case "Spear":
        character.setWeapon("Spear");
        character.addIntelligence(10);
        character.addStrength(5);
        break;
      case "Dagger":
        character.setWeapon("Dagger");
        character.addAgility(5);
        character.addStealth(10);
        break;
      default:
        character.setWeapon("No weapon");
        break;
    }
  }
  public static void createArmor(Character character, String armor){

    switch (armor) {
      case "Leather":
        character.setArmor("Robe");
        character.addHp(10);
        character.addMana(20);
        break;
      case "Chainmail":
        character.setArmor("Chainmail");
        character.addHp(15);
        character.addAgility(10);
        break;
      case "Plate":
        character.setArmor("Plate");
        character.addHp(20);
        character.addStrength(10);
        break;
      default:
        character.setArmor("No armor");
        break;
    }
  }
}
