package StorageSystem;

class Vare {
  String type;
  String name;
  double size; // m^3

  Vare(String type, String name, double size) {
    this.type = type;
    this.name = name;
    this.size = size;
  }

}

class Lager {
  String name;
  String building;
  double capacity; // m^3
  double usedCapacity;

  Lager(String name, String building, double capacity) {
    this.name = name;
    this.building = building;
    this.capacity = capacity;
    this.usedCapacity = 0;
  }

}

public class Main {
  public static void main(String[] args) {
    Lager lager_B67 = new Lager("Lager B67", "Building B", 10);

    // Vare objects
    Vare BB810 = new Vare("Electronics", "Laptop", 0.5);
    Vare AA910 = new Vare("Food", "Orange", 0.2);
    Vare OO420 = new Vare("Misc", "Chair", 1.5);

    System.out.println(BB810.name + " is of type: " + BB810.type);
    System.out.println(AA910.name + " is of type: " + AA910.type);
    System.out.println(OO420.name + " is of type: " + OO420.type);
  }
}
