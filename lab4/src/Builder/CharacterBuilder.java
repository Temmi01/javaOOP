package Builder;

import java.util.Arrays;
import java.util.List;

public interface CharacterBuilder {
  List<String> weapons = Arrays.asList("Staff", "Sword", "Axe", "Spear", "Dagger", "No weapon");
  List<String> armors = Arrays.asList("Leather", "Chainmail", "Plate", "No armor");
  List<String> characterClasses = Arrays.asList("Warrior", "Mage", "Technician", "Assassin", "Farmer");

  Character build();
  CharacterBuilder buildDefaults();
  CharacterBuilder buildAbilities();
  CharacterBuilder buildWeapon(String weapon);
  CharacterBuilder buildArmor(String armor);
  CharacterBuilder buildClass(String characterClass);
}
