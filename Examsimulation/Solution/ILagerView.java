package Examsimulation.Solution;

import java.util.List;

interface ILagerView {
  List<Vare> getVarer(Lagerplads p) throws NonExistentLagerplads;

  double usedSpace(Lagerplads p) throws NonExistentLagerplads;

  double freeSpace(Lagerplads p) throws NonExistentLagerplads;

  List<Lagerplads> getPladser();
}
