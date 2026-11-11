package StorageSystem;

public class Main {
  public static void main(String[] args) {
    Central centralLager_A112 = new Central("Central Lager A112", "Building A", 20);

    Lager lager_B67 = new Lager("Lager B67", "Building B", 10);

    Vare BB810 = new Vare("Electronics", "Laptop", 0.5);
    Vare AA910 = new Vare("Food", "Orange", 0.2);
    Vare OO420 = new Vare("Misc", "Chair", 1.5);

    System.out.println("Adding BB810: " + lager_B67.addVare(BB810, centralLager_A112));

    System.out.println("Locations: " + centralLager_A112.locations);
    System.out.println("Items: " + centralLager_A112.items);

    System.out.println("Used capacity: " + lager_B67.usedCapacity);

    System.out.println("Removing BB810: " + lager_B67.removeVare(BB810, centralLager_A112));

    System.out.println("Used capacity: " + lager_B67.usedCapacity);

    System.out.println(centralLager_A112.findSpace(AA910));

    System.out.println(BB810.name + " is of type: " + BB810.type);
    System.out.println(AA910.name + " is of type: " + AA910.type);
    System.out.println(OO420.name + " is of type: " + OO420.type);
  }
}
