package org.sudoku;

public class App {
  public static void main(String[] args) {

    Grid grid = new Grid();
    Validation validation = new Validation();
    SudokuGenerator gen = new SudokuGenerator();
    grid.addListener(new ISudokuListener() {

      public void onSudokuReset() {
        System.out.println("Sudoku was reset");
      }

      public void onSudokuValueSet(int x, int y, int value) {
        System.out.println(String.format("Value %d set at (%d, %d)", value, x, y));
      }
    });

    try {
      gen.generate(grid, 80);

      PrintGrid.print(grid);

      grid = gen.restart();

      PrintGrid.print(grid);

      if (validation.validateSudoku(grid)) {
        System.out.println("Sudoku is solved!");
      }

    } catch (SudokuExceptions e) {
      System.out.println(e.getMessage());
    }

  }
}
