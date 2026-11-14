package org.suduko;

public class App {
  public static void main(String[] args) {

    Grid grid = new Grid();

    grid.set(0, 0, 5);
    grid.set(1, 0, 3);
    grid.set(4, 0, 7);

    PrintGrid.print(grid);
  }
}
