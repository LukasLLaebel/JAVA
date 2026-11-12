public class Header extends DocumentElement {
  public Header(String h) {

  }

  void accept(IVisitor visitor) {
    visitor.caseHeader(h)
  }
}
