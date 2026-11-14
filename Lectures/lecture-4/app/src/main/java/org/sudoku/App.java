package org.sudoku;

public class App {
  public static void main(String[] args) {

    Grid grid = new Grid();

    grid.addListener(new ISudokuListener() {

      public void onSudokuReset() {
        System.out.println("Sudoku was reset");
      }

      public void onSudokuValueSet(int x, int y, int value) {
        System.out.println(String.format("Value %d set at (%d, %d)", value, x, y));
      }
    });

    try {
      grid.set(8, 0, 9);
      grid.set(1, 0, 3);
      grid.set(4, 0, 7);

      PrintGrid.print(grid);

      grid.reset();
    } catch (SudokuExceptions e) {
      System.out.println(e.getMessage());
    }
  }
}
