import java.util.Scanner;

public class Crypto {

  // main Cipher code.
  // make sure letters and shift is between 0-25, and wrap around if it goes over
  // 25 or under 0.
  // First for capical letters then lowercase letters. If not a letter, just
  // return the same character.
  public static String caesarCipher(String input, int shift) {
    String result = "";
    shift = shift % 26;

    for (int i = 0; i < input.length(); i++) {
      char letter = input.charAt(i);
      if (letter >= 'A' && letter <= 'Z') {
        letter = (char) ('A' + (letter - 'A' + shift + 26) % 26);
      } else if (letter >= 'a' && letter <= 'z') {
        letter = (char) ('a' + (letter - 'a' + shift + 26) % 26);
      }
      result += letter;
    }
    return result;
  }

  // Console interaction for user input and output
  public static void main(String[] args) {
    Scanner text = new Scanner(System.in);

    System.out.println("Enter string to encrypt: ");
    String input = text.nextLine();

    System.out.println("Enter shift value: ");
    int shiftValue = text.nextInt();

    String encrypted = caesarCipher(input, shiftValue);

    System.out.println("Inputted text: " + input);
    System.out.println("Shift value: " + shiftValue);
    System.out.println("Encrypted text: " + encrypted);

    text.close();
  }
}
