package org.sudoku;

public interface ISudokuListener {

  void onSudokuReset();

  void onSudokuValueSet(int x, int y, int value);
}
