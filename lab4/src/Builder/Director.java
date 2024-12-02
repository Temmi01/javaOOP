package Builder;

public class Director {
  public void constructWarrior(CharacterBuilder builder) {
    builder.buildDefaults();
    builder.buildAbilities();
    builder.buildWeapon("Axe");
    builder.buildArmor("Plate");
    builder.buildClass("Warrior");
  }
}
