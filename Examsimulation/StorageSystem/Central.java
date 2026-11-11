package StorageSystem;

import java.util.ArrayList;
import java.util.List;

public class Central extends Lager {
  List<Lager> locations = new ArrayList<>();
  List<StoredVare> items = new ArrayList<>();

  Central(String name, String building, double capacity) {
    super(name, building, capacity);
  }

  String findSpace(Vare vare) {
    for (Lager lager : locations) {
      if (lager.usedCapacity + vare.size <= lager.capacity) {
        return "Space found in " + lager.name;
      }
    }
    return "No space found for " + vare.name;
  }

  boolean addVare(Vare vare, Lager lager) {
    if (!locations.contains(lager)) {
      locations.add(lager);
    }
    items.add(new StoredVare(vare, lager));
    return true;
  }

  boolean removeVare(Vare vare, Lager lager) {
    for (int i = 0; i < items.size(); i++) {
      StoredVare stored = items.get(i);
      if (stored.vare == vare && stored.lager == lager) {
        items.remove(i);
        return true;
      }
    }
    return false;
  }
}

class StoredVare {
  Vare vare;
  Lager lager;

  StoredVare(Vare vare, Lager lager) {
    this.vare = vare;
    this.lager = lager;
  }

  @Override
  public String toString() {
    return vare + " -> " + lager.name;
  }
}
