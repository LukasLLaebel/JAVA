// - Any live cell with fewer than two live neighbours dies, as if caused by underpopulation. 
// - Any live cell with two or three live neighbours lives on to the next generation. 
// - Any live cell with more than three live neighbours dies, as if by overpopulation.
// - Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction

import java.util.Random;

// Control each cell state: Dead or Alive. 
// As default its dead. 
// Symbol is then unicode ether gray or white blocks
class Cell {
  private boolean alive;

  public Cell() {
    this.alive = false;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public char getSymbol() {
    return alive ? '\u2588' : '\u2591';
  }
}

// The main logic of the game.
// It stores an two dimensional array of Cell objects and manages their state
// across generations.
// Every cell is created at the start as dead.
//
// It creates an grid using a specified number of rows and coloumns.
// As well as starting the game by choosing a random cell as alive on a
// probability
// Counting the living neighbors of each cell
// The next generation is then created based on the rules at the top.
//
// nextGeneration() method creates and returns a new Grid instead of modifying
// the current one,
// allowing the current generation to be used safely while calculating the next
// generation.
class Grid {
  private final int rows;
  private final int cols;
  private final Cell[][] cells;

  public Grid(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.cells = new Cell[rows][cols];

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < cols; x++) {
        cells[y][x] = new Cell();
      }
    }
  }

  public void randomize(double aliveChance) {
    Random random = new Random();

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < cols; x++) {
        cells[y][x].setAlive(random.nextDouble() < aliveChance);
      }
    }
  }

  public void print(int generation) {
    System.out.println("Game of Life - Generation " + generation);
    System.out.println("Press Ctrl+C to stop.");

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < cols; x++) {
        System.out.print(cells[y][x].getSymbol());
      }

      System.out.println();
    }
  }

  public int neighborCount(int x, int y) {
    int count = 0;

    for (int dy = -1; dy <= 1; dy++) {
      for (int dx = -1; dx <= 1; dx++) {
        if (dx == 0 && dy == 0) {
          continue;
        }

        int neighborX = x + dx;
        int neighborY = y + dy;

        if (neighborX >= 0 && neighborX < cols &&
            neighborY >= 0 && neighborY < rows &&
            cells[neighborY][neighborX].isAlive()) {
          count++;
        }
      }
    }

    return count;
  }

  public Grid nextGeneration() {
    Grid nextGrid = new Grid(rows, cols);

    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < cols; x++) {
        boolean currentlyAlive = cells[y][x].isAlive();
        int neighbors = neighborCount(x, y);

        boolean aliveInNextGeneration;

        if (currentlyAlive) {
          aliveInNextGeneration = neighbors == 2 || neighbors == 3;
        } else {
          aliveInNextGeneration = neighbors == 3;
        }

        nextGrid.cells[y][x].setAlive(aliveInNextGeneration);
      }
    }

    return nextGrid;
  }
}

// The initialization of the game, setting up the grid and starting the loop to
// update generations.
// set the number of rows and columns, the chance of a cell being alive at the
// start, and the delay between generations.
//
public class Life {
  public static void main(String[] args) throws InterruptedException {
    final int rows = 20;
    final int cols = 40;

    final double aliveChance = 0.25;

    final long delay = 200;

    Grid grid = new Grid(rows, cols);
    grid.randomize(aliveChance);

    int generation = 0;

    System.out.println("Welcome to Game of Life!");

    // Game loop
    while (true) {
      clearConsole();
      grid.print(generation);

      Thread.sleep(delay);

      grid = grid.nextGeneration();
      generation++;
    }
  }

  // using excape sequences to clear the console and move the cursor to the top
  // left corner.
  // Then clear the full screen and flush the output stream to ensure that the
  // console is cleared immediately.
  private static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
