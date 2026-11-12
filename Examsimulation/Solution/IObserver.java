package Examsimulation.Solution;

public interface IObserver {
  void addedVare(Lagerplads p, Vare v);

  void removedVare(Lagerplads p, Vare v);
}
