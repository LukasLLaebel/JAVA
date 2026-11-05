package StorageSystem;

import java.util.ArrayList;

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

class Central extends Lager {
  ArrayList<String> locations = new ArrayList<String>();
  ArrayList<String> items = new ArrayList<String>();

  Central(String name, String building, double capacity) {
    super(name, building, capacity);
  }

  boolean addVare(Vare vare, String location) {
    locations.add(location);
    items.add(vare.name);
    return true;
  }

  boolean removeVare(Vare vare, String location) {
    int index = locations.indexOf(location);
    if (index != -1 && items.get(index).equals(vare.name)) {
      locations.remove(index);
      items.remove(index);
      return true;
    }
    return false;
  }

}

class Lager {
  String name;
  String building;
  double capacity;
  double usedCapacity;

  Lager(String name, String building, double capacity) {
    this.name = name;
    this.building = building;
    this.capacity = capacity;
    this.usedCapacity = 0;
  }

  boolean addVare(Vare vare, Central central) {
    if (usedCapacity + vare.size <= capacity) {
      usedCapacity += vare.size;
      central.addVare(vare, this.building);
      return true;
    } else {
      return false;
    }
  }

  boolean removeVare(Vare vare, Central central) {
    if (usedCapacity - vare.size >= 0) {
      usedCapacity -= vare.size;
      central.removeVare(vare, this.building);
      return true;
    } else {
      return false;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Central centralLager_A112 = new Central("Central Lager A112", "Building A", 20);
    Lager lager_B67 = new Lager("Lager B67", "Building B", 10);

    // Vare objects
    Vare BB810 = new Vare("Electronics", "Laptop", 0.5);
    Vare AA910 = new Vare("Food", "Orange", 0.2);
    Vare OO420 = new Vare("Misc", "Chair", 1.5);

    System.out.println("Adding BB810: " + lager_B67.addVare(BB810, centralLager_A112));

    System.out.println("Locations for items : " + centralLager_A112.locations);
    System.out.println("Items : " + centralLager_A112.items);

    System.out.println("Used capacity: " + lager_B67.usedCapacity);

    System.out.println("Removing BB810: " + lager_B67.removeVare(BB810, centralLager_A112));

    System.out.println("Used capacity: " + lager_B67.usedCapacity);

    System.out.println(BB810.name + " is of type: " + BB810.type);
    System.out.println(AA910.name + " is of type: " + AA910.type);
    System.out.println(OO420.name + " is of type: " + OO420.type);

  }
}
