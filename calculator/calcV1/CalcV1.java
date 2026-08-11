import java.util.Scanner;

public class CalcV1 {
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
    // ReplaceAll replaces all spaces
    // s+ whitespace characters (spaces, tabs, line breaks) one or more times
    // Split the expression into numbers and operators ()
    //
    // [...] One character from this set
    // + plus operator
    // \- literal minus
    // * multiply operator
    // / divide operator
    // (?=...) Lookahead without consuming
    // (?<=...) Lookbehind without consuming
    // | OR operator
    String[] parts = expression.replaceAll("\\s+", "").split("(?=[+\\-*/])|(?<=[+\\-*/])");

    int result = Integer.parseInt(parts[0]);

    for (int i = 1; i < parts.length; i += 2) {
      String operator = parts[i];
      int number = Integer.parseInt(parts[i + 1]);

      switch (operator) {
        case "+":
          result += number;
          break;

        case "-":
          result -= number;
          break;

        case "*":
          result *= number;
          break;

        case "/":
          if (number == 0) {
            throw new ArithmeticException("Cannot divide by zero");
          }
          result /= number;
          break;
      }
    }

    return result;
  }
}
