package org.suduko;

public class PrintGrid {

  public static void print(Grid grid) {
    for (int y = 0; y < 9; y++) {

      for (int x = 0; x < 9; x++) {
        System.out.print(grid.get(x, y) + " ");
      }

      System.out.println();
    }
  }
}
