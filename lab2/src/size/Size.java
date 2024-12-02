package size;

public enum Size {
  SMALL("small"), MEDIUM("medium"), LARGE("large");

  private final String abbreviation;

  private Size(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
}
