package calc;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Calculator!");

    while (scanner.hasNextLine()) {
      String input = scanner.nextLine();

      if (input.contains("=")) {
        String expression = input.substring(0, input.indexOf("="));

        int result = calculate(expression);

        System.out.println(input + result);
      }
    }

    scanner.close();
  }

  public static int calculate(String expression) {
    return new Parser(expression).parse();
  }
}
