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
    grid[x][y] = val;
  }

  public void reset() {
    for (int y = 0; y < 9; y++) {
      for (int x = 0; x < 9; x++) {
        grid[x][y] = 0;
      }
    }
  }
}
