package yatzy;

import java.util.Random;

class rules {

}

class yatzy extends rules {

}

class Player {
  String name;
  int score;
  int round;
  int diceCount;

  Player(String name, int score, int round, int diceCount) {
    this.name = name;
    this.score = score;
    this.round = round;
    this.diceCount = diceCount;
  }
}

class Dice {
  int rollValue;

  void roll() {
    Random rand = new Random();
    this.rollValue = rand.nextInt(6) + 1;
  }

  void display() {
    System.out.println("Dice rolled: " + this.rollValue);
  }
}

public class Game {
  public static void main(String[] args) {
    Dice dice1 = new Dice();

    dice1.roll();
    dice1.display();
  }
}
