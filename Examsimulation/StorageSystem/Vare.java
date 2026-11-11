package StorageSystem;

public class Vare {
  String type;
  String name;
  double size; // m^3

  Vare(String type, String name, double size) {
    this.type = type;
    this.name = name;
    this.size = size;
  }

  @Override
  public String toString() {
    return name + " (" + type + ", " + size + " m^3)";
  }
}
