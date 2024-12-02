package Builder;

import Creator.*;

public class OgreBuilder implements CharacterBuilder {
  private Character character;
  private final String name;

  public OgreBuilder(String name){
    this.name = name;
    this.reset();
  }

  public void reset() {
    this.character = new Character(this.name);
    this.character.setRace("Ogre");
  }

  @Override
  public Character build() {
    return character;
  }

  @Override
  public CharacterBuilder buildDefaults() {
    this.character.addHp(250);
    this.character.addMana(40);
    this.character.addStealth(10);
    this.character.addStrength(80);
    this.character.addIntelligence(15);
    this.character.addAgility(1);
    return this;
  }

  @Override
  public CharacterBuilder buildAbilities() {
    this.character.setAbilities(Creator.createRaceAbilities("Ogre"));
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
