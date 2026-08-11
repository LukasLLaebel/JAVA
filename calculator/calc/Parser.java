package calc;

public class Parser {
  private final String input;
  private int pos = 0;

  public Parser(String input) {
    this.input = input.replaceAll("\\s+", "");
  }

  public int parse() {
    int result = expression();

    if (pos < input.length()) {
      throw new IllegalArgumentException(
          "Unexpected character: " + input.charAt(pos));
    }

    return result;
  }

  private int expression() {
    int result = term();

    while (pos < input.length()) {
      char operator = input.charAt(pos);

      if (operator == '+') {
        pos++;
        result += term();
      } else if (operator == '-') {
        pos++;
        result -= term();
      } else {
        break;
      }
    }

    return result;
  }

  private int term() {
    int result = factor();

    while (pos < input.length()) {
      char operator = input.charAt(pos);

      if (operator == '*') {
        pos++;
        result *= factor();
      } else if (operator == '/') {
        pos++;

        int number = factor();

        if (number == 0) {
          throw new ArithmeticException(
              "Cannot divide by zero");
        }

        result /= number;
      } else {
        break;
      }
    }

    return result;
  }

  private int factor() {
    if (input.charAt(pos) == '(') {
      pos++;

      int result = expression();

      if (pos >= input.length() || input.charAt(pos) != ')') {
        throw new IllegalArgumentException("Missing ')'");
      }

      pos++;

      return result;
    }

    return number();
  }

  private int number() {
    int start = pos;

    while (pos < input.length() &&
        Character.isDigit(input.charAt(pos))) {
      pos++;
    }

    if (start == pos) {
      throw new IllegalArgumentException(
          "Expected number at position " + pos);
    }

    return Integer.parseInt(input.substring(start, pos));
  }
}
