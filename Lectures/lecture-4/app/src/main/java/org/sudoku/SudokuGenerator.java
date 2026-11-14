package org.sudoku;

import java.util.ArrayList;
import java.util.Collections;

public class SudokuGenerator {
  Grid originalGrid;

  private Validation validation = new Validation();

  public void generate(Grid grid, int emptyCells) {
    grid.reset();

    fillGrid(grid, 0, 0);

    removeNumbers(grid, emptyCells);
    originalGrid = grid;
  }

  public Grid restart() {
    return originalGrid;
  }

  private boolean fillGrid(Grid grid, int x, int y) {

    if (y == 9) {
      return true;
    }

    int nextX = (x + 1) % 9;
    int nextY = y + (x + 1) / 9;

    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 1; i <= 9; i++) {
      numbers.add(i);
    }

    Collections.shuffle(numbers);

    for (int num : numbers) {
      if (validation.validateNum(grid, x, y, num)) {
        grid.set(x, y, num);

        if (fillGrid(grid, nextX, nextY)) {
          return true;
        }

        grid.unset(x, y);
      }
    }

    return false;
  }

  private void removeNumbers(Grid grid, int amount) {

    ArrayList<Integer> positions = new ArrayList<>();

    for (int i = 0; i < 81; i++) {
      positions.add(i);
    }

    Collections.shuffle(positions);

    for (int i = 0; i < amount; i++) {
      int position = positions.get(i);

      int x = position % 9;
      int y = position / 9;

      grid.unset(x, y);
    }
  }
}
