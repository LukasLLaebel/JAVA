import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class WordLoader {
  public static List<String> loadWords() {

    List<String> words = new ArrayList<>();

    try {
      File file = new File("words.csv");
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
        String word = scanner.nextLine().trim();
        System.out.println(word);
        if (!word.isEmpty()) {
          words.add(word);
        }
      }

      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Could not find words.csv");
    }

    return words;
  }
}

class Grid {
  private enum LetterResult {
    GREEN,
    YELLOW,
    GRAY
  }

  private static LetterResult validateInput(char inputtedLetter, String word, int position) {
    inputtedLetter = Character.toLowerCase(inputtedLetter);
    word = word.toLowerCase();

    if (word.charAt(position) == inputtedLetter) {
      return LetterResult.GREEN;
    }

    if (word.indexOf(inputtedLetter) != -1) {
      return LetterResult.YELLOW;
    }
    return LetterResult.GRAY;
  }

  private static String getColor(LetterResult result) {
    return switch (result) {
      case GREEN -> "\u001B[32m";
      case YELLOW -> "\u001B[33m";
      case GRAY -> "\u001B[38;5;248m";
    };
  }

  public static void printGrid(String word, String inputtedWord) {

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);

      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);

      System.out.print(color + "\u250C\u2500\u2500\u2500\u2510\u001B[0m ");
    }
    System.out.println();

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);

      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);

      System.out.print(
          color + "\u2502 " + letter + " \u2502\u001B[0m ");
    }
    System.out.println();

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);

      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);
      System.out.print(color + "\u2514\u2500\u2500\u2500\u2518\u001B[0m ");
    }
    System.out.println();
  }

}

public class Wordle {
  public static void main(String[] args) {
    int attemptCount = 0;
    int maxAttempts = 6;

    Grid.printGrid("HELLO", "MANDE");
  }
}
