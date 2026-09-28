
class BookInfo {
  String title;
  String author;
  String ISBN;
  String language;
  String genre;
  int publicationYear;
  int pages;

  BookInfo(String title, String author, String ISBN, String language, String genre, int publicationYear, int pages) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.language = language;
    this.genre = genre;
    this.publicationYear = publicationYear;
    this.pages = pages;
  }

  void CalcSpeed() {
    System.out.println("The reading speed on " + this.title + " is " + (pages / 60) + " pages per hour");
  }
}

public class Book {
  public static void main(String[] args) {
    BookInfo HarryPotter1 = new BookInfo("Harry Potter 1 - The pholoseephers stone",
        "J. K. Rowling",
        " 9788702173222",
        "English",
        "Fantasy",
        1997,
        360);

    HarryPotter1.CalcSpeed();
  }
}
