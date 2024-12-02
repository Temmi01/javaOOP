package Builder;

import Creator.*;

public class HumanBuilder implements CharacterBuilder {
  protected Character character;
  private final String name;

  @Override
  public CharacterBuilder buildDefaults() {
    this.character.addHp(120);
    this.character.addMana(60);
    this.character.addStealth(35);
    this.character.addStrength(35);
    this.character.addIntelligence(50);
    this.character.addAgility(30);
    return this;
  }

  public HumanBuilder(String name){
    this.name = name;
    this.reset();
  }

  public void reset() {
    this.character = new Character(this.name);
    this.character.setRace("Human");
  }

  @Override
  public Character build() {
    return character;
  }

  @Override
  public CharacterBuilder buildAbilities() {
    this.character.setAbilities(Creator.createRaceAbilities("Human"));
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
