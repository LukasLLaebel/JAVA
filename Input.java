import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int i = scanner.nextInt();
    scanner.nextLine(); // Consume the leftover newline

    System.out.print("Enter a string: ");
    String s = scanner.nextLine();

    System.out.println("You entered integer: " + i);
    System.out.println("You entered string: " + s);

    scanner.close();
  }
}
