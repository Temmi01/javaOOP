package Builder;

import Creator.*;

public class DwarfBuilder implements CharacterBuilder{
  private Character character;
  private final String name;

  public DwarfBuilder(String name){
    this.name = name;
    this.reset();
  }

  public void reset() {
    this.character = new Character(this.name);
    this.character.setRace("Dwarf");
  }

  @Override
  public Character build() {
    return character;
  }

  @Override
  public CharacterBuilder buildDefaults() {
    this.character.addHp(180);
    this.character.addMana(80);
    this.character.addStealth(35);
    this.character.addStrength(40);
    this.character.addIntelligence(40);
    this.character.addAgility(25);
    return this;
  }

  @Override
  public CharacterBuilder buildAbilities() {
    this.character.setAbilities(Creator.createRaceAbilities("Dwarf"));
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
