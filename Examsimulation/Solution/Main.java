package Examsimulation.Solution;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var building = new LagerBuilding();

    var pladser = new ArrayList<Lagerplads>();
    pladser.add(new Lagerplads("Hylder 1", 10, building));
    pladser.add(new Lagerplads("Hylder 2", 20, building));
    Lager lager = new Lager(pladser);
    lager.addObserver(new IObserver() {
      public void addedVare(Lagerplads p, Vare v) {
        System.out.println(String.format("Added %s to %s", v, p));
      }

      public void removedVare(Lagerplads p, Vare v) {
        System.out.println(String.format("Removed %s from %s", v, p));
      }
    });

    Vare v = new Vare("Computer", VareType.Electronics, 2);
    var plads = lager.findSpace(v);
    try {
      lager.addVare(plads, v);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
