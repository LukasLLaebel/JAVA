package Examsimulation.Solution;

public class Lagerplads {
  Lagerplads(String name, double capacity, LagerBuilding building) {
    this.name = name;
    this.capacity = capacity;
    this.building = building;
  }

  public String getName() {
    return name;
  }

  public double getCapacity() {
    return capacity;
  }

  public LagerBuilding getBuilding() {
    return building;
  }

  public String toString() {
    return String.format("%s  : %f", name, capacity);
  }

  private String name;
  private double capacity;
  private LagerBuilding building;
}
