package Examsimulation.Solution;

public class Vare {
  public Vare(String n, VareType t, double s) {
    name = n;
    type = t;
    size = s;
  }

  public VareType getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public double getSize() {
    return size;
  }

  public String toString() {
    return String.format("%s-(%s)--:-%f", name, type, size);
  }

  private VareType type;
  private String name;
  private double size;
}
