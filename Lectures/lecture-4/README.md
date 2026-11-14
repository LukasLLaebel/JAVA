# Setup Gradle

Make an initialization of a Gradle project using the following command:

```bash
gradle init --type java-application  --dsl kotlin
```

To build the project, run the following command:

```bash
gradle build
```

Then you can run the prejct unsing the following command:

```bash
gradle run
```

Then change the example folder location to suduko/App.java
as well as in the test environment. (suduko/AppTest.java)

Before build you need to change the main folder to be suduko.
this can be done in:

```
#/app/build.gradle.kts
```

to view tasks use:

```bash
./gradlew tasks
```

# Sudoku in Java – Exercises

## Exercise 1 – Sudoku Board

Implement the basic functionality for managing the Sudoku board.

The board is represented by an integer array containing 81 elements. Each cell is accessed using an `(x, y)` coordinate, where `x` represents the column and `y` represents the row.

- [x] Implement `get(x, y)` to retrieve a cell value.
- [x] Implement `set(x, y, val)` to assign a value to a cell.
- [x] Ensure values are between 1 and 9.
- [x] Implement `reset()` to clear the board.
- [x] Implement `unset(x, y)` to clear a specific cell.

## Exercise 2 – Sudoku Exceptions

Implement error handling for the Sudoku board.

The `SudokuException` class should be used when an invalid operation is performed on the Sudoku board.

- [ ] Implement `SudokuException` with a meaningful error message.
- [ ] Throw an exception when setting a value outside 1–9.
- [ ] Throw an exception when accessing an invalid coordinate.
- [ ] Ensure invalid operations do not modify the board.

## Exercise 3 – Sudoku Listeners

Implement the listener functionality to notify other classes when the Sudoku board changes.

The `ISudokuListener` interface should be implemented by classes that want to receive notifications about changes to the board.

- [ ] Implement `ISudokuListener` in a separate class.
- [ ] Implement `addListener()` to register listeners.
- [ ] Implement `notifyListeners()` to notify registered listeners.
- [ ] Notify listeners when a cell changes.
- [ ] Test the listener functionality using a simple console output.

## Exercise 4 – Sudoku Validation

Implement the functionality required to validate a Sudoku board.

A Sudoku is valid when no number appears more than once in the same row, column, or 3×3 square.

- [ ] Implement a method to check whether a number exists in a row.
- [ ] Implement a method to check whether a number exists in a column.
- [ ] Implement a method to check whether a number exists in a 3×3 square.
- [ ] Implement a method to determine whether a number can be placed in a cell.
- [ ] Implement a method to check whether the Sudoku is solved.

## Exercise 5 – Sudoku Game

Implement the functionality required to manage a Sudoku game.

A game should contain an initial puzzle and allow the player to solve it without modifying the predefined numbers.

- [ ] Implement a method to load a predefined Sudoku puzzle.
- [ ] Store the original puzzle separately from the current board.
- [ ] Prevent changing predefined puzzle cells.
- [ ] Implement a method to restart the puzzle.
- [ ] Implement a method to check whether the puzzle is completed.
- [ ] Display a message when the puzzle is solved.

## Exercise 6 – Sudoku User Interface

Implement a graphical user interface for the Sudoku application using Java Swing.

The UI should display the Sudoku board and allow the user to interact with it. The UI should communicate with the Sudoku model through the listener interface.

- [ ] Display the Sudoku board as a 9×9 grid.
- [ ] Display the current value of each cell.
- [ ] Allow the user to select a cell.
- [ ] Allow the user to enter numbers into cells.
- [ ] Prevent modifying predefined puzzle cells.
- [ ] Implement `ISudokuListener` in the UI.
- [ ] Update the UI when the Sudoku model changes.
- [ ] Implement a reset button.
- [ ] Display a message when the Sudoku is solved.

---

## Final Requirements

- [ ] All six exercises are completed.
- [ ] The Sudoku model works independently of the UI.
- [ ] The UI communicates with the model using listeners.
- [ ] The application can load and solve a Sudoku puzzle.
