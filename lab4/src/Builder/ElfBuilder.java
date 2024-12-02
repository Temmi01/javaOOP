package Builder;

import Creator.*;

public class ElfBuilder implements CharacterBuilder{
  private Character character;
  private final String name;

  public ElfBuilder(String name){
    this.name = name;
    this.reset();
  }

  public void reset() {
    this.character = new Character(this.name);
    this.character.setRace("Elf");
  }

  @Override
  public Character build() {
    return character;
  }

  @Override
  public CharacterBuilder buildDefaults() {
    this.character.addHp(70);
    this.character.addMana(70);
    this.character.addStealth(40);
    this.character.addStrength(10);
    this.character.addIntelligence(70);
    this.character.addAgility(70);
    return this;
  }

  @Override
  public CharacterBuilder buildAbilities() {
    this.character.setAbilities(Creator.createRaceAbilities("Elf"));
    return this;
  }

  @Override
  public CharacterBuilder buildWeapon(String weapon) {
    Creator.createWeapon(this.character, weapon);
    return this;
  }

  @Override
  public CharacterBuilder buildArmor(String armor) {
    Creator.createArmor(this.character, armor);
    return this;
  }

  @Override
  public CharacterBuilder buildClass(String characterClass) {
    Creator.createClass(this.character, characterClass);
    return this;
  }
}
