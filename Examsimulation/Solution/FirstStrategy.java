package Examsimulation.Solution;

public class FirstStrategy implements IStrategy {

  public Lagerplads findSpace(ILagerView view, Vare v) {
    var list = view.getPladser();
    for (var p : list) {
      try {
        if (view.freeSpace(p) > v.getSize())
          return p;
      } catch (NonExistentLagerplads e) {
        // Cannot happen
      }
    }
    return null;
  }
}
