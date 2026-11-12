public class HTMLOutputter {

  void caseHeader(Header h) {
    System.out.println(String.format("<h1> %s </h1>", p.getHeadText()));
  }

  void caseParagraph(Paragraph p) {
    System.out.println(String.format("<p> %s </p>", p.getText()));
  }
}
