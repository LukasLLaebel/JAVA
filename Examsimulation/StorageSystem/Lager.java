package StorageSystem;

public class Lager {
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
      if (central.addVare(vare, this)) {
        usedCapacity += vare.size;
        return true;
      }
    }

    return false;
  }

  boolean removeVare(Vare vare, Central central) {
    if (central.removeVare(vare, this)) {
      usedCapacity -= vare.size;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return name + " (" + usedCapacity + "/" + capacity + " m^3)";
  }
}
