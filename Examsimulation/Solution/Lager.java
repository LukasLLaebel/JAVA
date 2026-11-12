package Examsimulation.Solution;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;

public class Lager implements ILagerView {
  Lager(List<Lagerplads> pladser) {
    this(pladser, new FirstStrategy());
  }

  Lager(List<Lagerplads> pladser, IStrategy strat) {
    mapning = new HashMap<Lagerplads, ArrayList<Vare>>();
    observers = new ArrayList<IObserver>();
    for (var l : pladser) {
      mapning.put(l, new ArrayList<Vare>());
    }
    this.strategy = strat;
  }

  public void addVare(Lagerplads p, Vare vare) throws NonExistentLagerplads, InsufficientSpace {

    double used = usedSpace(p);
    if (used + vare.getSize() > p.getCapacity())
      throw new InsufficientSpace();

    _getVarer(p).add(vare);
    for (var o : observers) {
      o.addedVare(p, vare);
    }
  }

  public void removeVare(Lagerplads p, Vare v) throws NonExistentLagerplads, VareNotInLager {
    var l = _getVarer(p);
    if (!l.contains(v))
      throw new VareNotInLager();

    l.remove(p);
    for (var o : observers) {
      o.removedVare(p, v);
    }
  }

  public List<Vare> getVarer(Lagerplads p) throws NonExistentLagerplads {
    var l = new ArrayList<Vare>();

    for (var v : _getVarer(p))
      l.add(v);
    return l;
  }

  public double usedSpace(Lagerplads p) throws NonExistentLagerplads {
    var l = _getVarer(p);
    double used = 0;
    for (var v : l) {
      used = used + v.getSize();
    }
    return used;
  }

  public double freeSpace(Lagerplads p) throws NonExistentLagerplads {
    return p.getCapacity() - usedSpace(p);
  }

  public List<Lagerplads> getPladser() {
    return new ArrayList<Lagerplads>(mapning.keySet());
  }

  Lagerplads findSpace(Vare v) {
    return strategy.findSpace(this, v);
  }

  private List<Vare> _getVarer(Lagerplads p) throws NonExistentLagerplads {
    if (mapning.containsKey(p))
      return mapning.get(p);
    throw new NonExistentLagerplads();
  }

  public void addObserver(IObserver ob) {
    observers.add(ob);
  }

  private HashMap<Lagerplads, ArrayList<Vare>> mapning;
  private IStrategy strategy;
  private ArrayList<IObserver> observers;
}
