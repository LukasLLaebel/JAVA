import java.util.ArrayList;
import java.util.List;

class Account {
  int id;
  String name;
  int amount;

  Account(int id, String name) {
    this.id = id;
    this.name = name;
    this.amount = 0;
  }

  void deposit(int amount) {
    this.amount += amount;
  }

  void withdraw(int amount) {
    this.amount -= amount;
  }

  void display() {
    System.out.println("Account ID: " + id);
    System.out.println("Account Name: " + name);
    System.out.println("Account Amount: " + amount);
  }

  void send(int amount, Account account, Books books) {
    this.amount -= amount;
    account.deposit(amount);

    books.addTransaction(
        amount,
        this.name,
        account.name);
  }
}

class Expenses extends Account {
  Expenses(int id, String name) {
    super(id, name);
  }
}

class Revenue extends Account {
  Revenue(int id, String name) {
    super(id, name);
  }
}

class Transaction {
  int amount;
  String from;
  String to;

  Transaction(int amount, String from, String to) {
    this.amount = amount;
    this.from = from;
    this.to = to;
  }

  @Override
  public String toString() {
    return from + " -> " + to + ": " + amount;
  }
}

class Books extends Account {
  private final List<Transaction> transactions = new ArrayList<>();

  Books(int id, String name) {
    super(id, name);
  }

  void addTransaction(int amount, String from, String to) {
    transactions.add(new Transaction(amount, from, to));
  }

  void transactionLog() {
    for (Transaction transaction : transactions) {
      System.out.println(transaction);
    }
  }
}

public class Bank {
  public static void main(String[] args) {
    // make transaction book
    Books ExToRe = new Books(1, "FromExpensesToRevenue");

    // Create account
    Expenses LukasExpenses = new Expenses(1, "LukasExpenses");
    Revenue LukasRevenue = new Revenue(2, "LukasRevenue");
    // add money
    LukasExpenses.deposit(1000);

    LukasExpenses.display();

    // make transaction
    LukasExpenses.send(500, LukasRevenue, ExToRe);
    LukasExpenses.send(200, LukasRevenue, ExToRe);
    LukasExpenses.send(100, LukasRevenue, ExToRe);

    // display log
    ExToRe.transactionLog();

    // display accounts
    LukasExpenses.display();
    LukasRevenue.display();

  }
}
