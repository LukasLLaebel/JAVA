import java.util.Scanner;

class Letters {
  private static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

  public static boolean isConsonant(char c) {
    c = Character.toLowerCase(c);
    if (c < 'a' || c > 'z') {
      return false;
    }
    return !isVowel(c);
  }

  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    for (char vowel : vowels) {
      if (c == vowel) {
        return true;
      }
    }
    return false;
  }
}

public class Consonants {
  // Takes console input and output.
  // It uses an if statement with the functions to check if the first letter is an
  // vowel or consonant
  public static void main(String[] args) {
    Scanner Text = new Scanner(System.in);

    System.out.println("Enter string: ");
    String input = Text.nextLine();

    if (Letters.isConsonant(input.charAt(0))) {
      System.out.println("First letter is a consonant.");

    } else if (Letters.isVowel(input.charAt(0))) {
      System.out.println("First letter is a vowel.");

    } else {
      System.out.println("Unknown first character.");
    }
    Text.close();
  }
}
