package org.sudoku;

public class SudokuExceptions {

  public static void invalidValue(int val) {
    throw new IllegalArgumentException(
        "Value must be between 1 and 9: " + val);
  }

  public static void invalidCoordinates(int x, int y) {
    throw new IndexOutOfBoundsException(
        "Coordinates must be between 0 and 8: (" + x + ", " + y + ")");
  }
}
