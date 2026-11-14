package org.sudoku;

public class App {
  public static void main(String[] args) {

    Grid grid = new Grid();
    Validation validation = new Validation();
    grid.addListener(new ISudokuListener() {

      public void onSudokuReset() {
        System.out.println("Sudoku was reset");
      }

      public void onSudokuValueSet(int x, int y, int value) {
        System.out.println(String.format("Value %d set at (%d, %d)", value, x, y));
      }
    });

    try {
      // Row 0
      grid.set(0, 0, 5);
      grid.set(1, 0, 3);
      grid.set(2, 0, 4);
      grid.set(3, 0, 6);
      grid.set(4, 0, 7);
      grid.set(5, 0, 8);
      grid.set(6, 0, 9);
      grid.set(7, 0, 1);
      grid.set(8, 0, 2);

      // Row 1
      grid.set(0, 1, 6);
      grid.set(1, 1, 7);
      grid.set(2, 1, 2);
      grid.set(3, 1, 1);
      grid.set(4, 1, 9);
      grid.set(5, 1, 5);
      grid.set(6, 1, 3);
      grid.set(7, 1, 4);
      grid.set(8, 1, 8);

      // Row 2
      grid.set(0, 2, 1);
      grid.set(1, 2, 9);
      grid.set(2, 2, 8);
      grid.set(3, 2, 3);
      grid.set(4, 2, 4);
      grid.set(5, 2, 2);
      grid.set(6, 2, 5);
      grid.set(7, 2, 6);
      grid.set(8, 2, 7);

      // Row 3
      grid.set(0, 3, 8);
      grid.set(1, 3, 5);
      grid.set(2, 3, 9);
      grid.set(3, 3, 7);
      grid.set(4, 3, 6);
      grid.set(5, 3, 1);
      grid.set(6, 3, 4);
      grid.set(7, 3, 2);
      grid.set(8, 3, 3);

      // Row 4
      grid.set(0, 4, 4);
      grid.set(1, 4, 2);
      grid.set(2, 4, 6);
      grid.set(3, 4, 8);
      grid.set(4, 4, 5);
      grid.set(5, 4, 3);
      grid.set(6, 4, 7);
      grid.set(7, 4, 9);
      grid.set(8, 4, 1);

      // Row 5
      grid.set(0, 5, 7);
      grid.set(1, 5, 1);
      grid.set(2, 5, 3);
      grid.set(3, 5, 9);
      grid.set(4, 5, 2);
      grid.set(5, 5, 4);
      grid.set(6, 5, 8);
      grid.set(7, 5, 5);
      grid.set(8, 5, 6);

      // Row 6
      grid.set(0, 6, 9);
      grid.set(1, 6, 6);
      grid.set(2, 6, 1);
      grid.set(3, 6, 5);
      grid.set(4, 6, 3);
      grid.set(5, 6, 7);
      grid.set(6, 6, 2);
      grid.set(7, 6, 8);
      grid.set(8, 6, 4);

      // Row 7
      grid.set(0, 7, 2);
      grid.set(1, 7, 8);
      grid.set(2, 7, 7);
      grid.set(3, 7, 4);
      grid.set(4, 7, 1);
      grid.set(5, 7, 9);
      grid.set(6, 7, 6);
      grid.set(7, 7, 3);
      grid.set(8, 7, 5);

      // Row 8
      grid.set(0, 8, 3);
      grid.set(1, 8, 4);
      grid.set(2, 8, 5);
      grid.set(3, 8, 2);
      grid.set(4, 8, 8);
      grid.set(5, 8, 6);
      grid.set(6, 8, 1);
      grid.set(7, 8, 7);
      grid.set(8, 8, 9);
      grid.set(0, 5, 7);
      grid.set(4, 5, 2);
      grid.set(8, 5, 6);

      grid.set(1, 6, 6);
      grid.set(6, 6, 2);
      grid.set(7, 6, 8);

      grid.set(3, 7, 4);
      grid.set(4, 7, 1);
      grid.set(5, 7, 9);
      grid.set(8, 7, 5);

      grid.set(4, 8, 8);
      grid.set(7, 8, 7);
      grid.set(8, 8, 9);

      PrintGrid.print(grid);

      if (validation.validateSudoku(grid)) {
        System.out.println("Sudoku is solved!");
      }

    } catch (SudokuExceptions e) {
      System.out.println(e.getMessage());
    }

  }
}
