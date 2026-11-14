package org.sudoku;

public class App {
  public static void main(String[] args) {

    Grid grid = new Grid();

    try {
      grid.set(8, 0, 9);
      grid.set(1, 0, 3);
      grid.set(4, 0, 7);

      grid.unset(1, 0);

      PrintGrid.print(grid);

    } catch (SudokuExceptions e) {
      System.out.println(e.getMessage());
    }
  }
}
