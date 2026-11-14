package org.sudoku;

public class SudokuExceptions extends RuntimeException {

  public SudokuExceptions(String message) {
    super(message);
  }

  public static void invalidValue(int val) {
    throw new SudokuExceptions(
        "Value must be between 1 and 9: " + val);
  }

  public static void invalidCoordinates(int x, int y) {
    throw new SudokuExceptions(
        "Coordinates must be between 0 and 8: (" + x + ", " + y + ")");
  }
}
