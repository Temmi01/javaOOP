package size;

public enum Size {
  SMALL("small"), MEDIUM("medium"), LARGE("large");

  // Field for the enum
  private final String abbreviation;

  // Constructor for the enum
  private Size(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  // Getter method for abbreviation
  public String getAbbreviation() {
    return abbreviation;
  }
}
