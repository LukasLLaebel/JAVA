import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class WordLoader {
  public static List<String> loadWords() {
    List<String> words = new ArrayList<>();

    try {
      File file = new File("words.csv");
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
        String word = scanner.nextLine()
            .trim()
            .toLowerCase();
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

  public static String getRandomWord(List<String> words) {
    if (words.isEmpty()) {
      return null;
    }

    Random random = new Random();
    return words.get(random.nextInt(words.size()));
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

  public static void printGrid(
      String word,
      String inputtedWord) {

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);
      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);

      System.out.print(color + "\u250C\u2500\u2500\u2500\u2510" + "\u001B[0m ");
    }
    System.out.println();

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);
      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);

      System.out.print(color + "\u2502 " + letter + " \u2502" + "\u001B[0m ");
    }
    System.out.println();

    for (int i = 0; i < word.length(); i++) {
      char letter = inputtedWord.charAt(i);
      LetterResult result = validateInput(letter, word, i);
      String color = getColor(result);

      System.out.print(color + "\u2514\u2500\u2500\u2500\u2518" + "\u001B[0m ");
    }
    System.out.println();
  }
}

public class Wordle {
  public static void main(String[] args) {
    int maxAttempts = 6;
    Scanner inputScanner = new Scanner(System.in);

    List<String> words = WordLoader.loadWords();
    if (words.isEmpty()) {
      System.out.println(
          "No words found in words.csv.");
      inputScanner.close();
      return;
    }

    String secretWord = WordLoader.getRandomWord(words);

    System.out.println("Welcome to Wordle!");
    System.out.println("You have " + maxAttempts + " attempts.");
    System.out.println();

    // Game loop
    for (int attemptCount = 0; attemptCount < maxAttempts; attemptCount++) {

      System.out.println("Attempt " + (attemptCount + 1) + "/" + maxAttempts);
      System.out.print("Enter Word Guess: ");

      String input = inputScanner
          .nextLine()
          .trim()
          .toLowerCase();

      if (input.length() != secretWord.length()) {
        System.out.println("Your word must contain " + secretWord.length() + " letters.");
        System.out.println();
        attemptCount--;
        continue;
      }

      // Print the guess
      Grid.printGrid(secretWord, input);

      if (input.equals(secretWord)) {
        System.out.println();
        System.out.println("Correct!");
        System.out.println("You found the word in " + (attemptCount + 1) + " attempts!");

        inputScanner.close();
        return;
      }
      System.out.println();
    }
    System.out.println("Game over!");
    System.out.println("The word was: " + secretWord);

    inputScanner.close();
  }
}
