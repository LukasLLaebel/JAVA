
package org.sudoku;

public class Validation {

  private boolean validateNumRow(Grid grid, int x, int y, int num) {
    for (int i = 0; i < 9; i++) {
      if (i != x && grid.get(i, y) == num) {
        return false;
      }
    }
    return true;
  }

  private boolean validateNumColumn(Grid grid, int x, int y, int num) {
    for (int i = 0; i < 9; i++) {
      if (i != y && grid.get(x, i) == num) {
        return false;
      }
    }
    return true;
  }

  private boolean validateNumSquare(Grid grid, int x, int y, int num) {
    int startX = (x / 3) * 3;
    int startY = (y / 3) * 3;

    for (int i = startX; i < startX + 3; i++) {
      for (int j = startY; j < startY + 3; j++) {
        if ((i != x || j != y) && grid.get(i, j) == num) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean validateNum(Grid grid, int x, int y, int num) {
    return validateNumRow(grid, x, y, num)
        && validateNumColumn(grid, x, y, num)
        && validateNumSquare(grid, x, y, num);
  }

  public boolean validateSudoku(Grid grid) {
    for (int y = 0; y < 9; y++) {
      for (int x = 0; x < 9; x++) {
        int num = grid.get(x, y);

        if (num < 1 || num > 9) {
          return false;
        }

        if (!validateNum(grid, x, y, num)) {
          return false;
        }
      }
    }

    return true;
  }
}
