package org.suduko;

public class Grid {
  private int[][] grid;

  public Grid() {
    grid = new int[9][9];
  }

  public int get(int x, int y) {
    return grid[x][y];
  }

  public void set(int x, int y, int val) {
    if (val < 1 || val > 9) {
      throw new IllegalArgumentException("Value must be between 1 and 9");
    }

    if (x < 0 || x >= 9 || y < 0 || y >= 9) {
      throw new IndexOutOfBoundsException("Coordinates must be between 0 and 8");
    }

    grid[x][y] = val;
  }

  public void reset() {
    for (int y = 0; y < 9; y++) {
      for (int x = 0; x < 9; x++) {
        grid[x][y] = 0;
      }
    }
  }

  public void unset(int x, int y) {
    grid[x][y] = 0;
  }

}
