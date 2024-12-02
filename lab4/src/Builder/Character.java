package Builder;

public class Character {
  private int hp = 0;
  private int strength = 0;
  private int stealth = 0;
  private int intelligence = 0;
  private int mana = 0;
  private int agility = 0;
  private String name;
  private String race;
  private String characterClass;
  private String abilities;
  private String weapon;
  private String armor;

  public Character(String name) {
    this.name = name;
    this.weapon = "No weapon";
    this.armor = "No armor";
  }

  public void addHp(int hp) {
    this.hp += hp;
  }

  public void addAgility(int agility) {
    this.agility += agility;
  }

  public void addStrength(int strength) {
    this.strength += strength;
  }

  public void addStealth(int stealth) {
    this.stealth += stealth;
  }

  public void addIntelligence(int intelligence) {
    this.intelligence += intelligence;
  }

  public void addMana(int mana) {
    this.mana += mana;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public void setCharacterClass(String characterClass) {
    this.characterClass = characterClass;
  }

  public void setAbilities(String abilities) {
    this.abilities = abilities;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void setArmor(String armor) {
    this.armor = armor;
  }

  public String toString() {
    return "Name: " + this.name + "\n" + "Race: " + this.race + "\n" + "Class: " + this.characterClass + "\n" + "Abilities: " + this.abilities + "\n" + "Weapon: " + this.weapon + "\n" + "Armor: " + this.armor + "\n";
  }
}
