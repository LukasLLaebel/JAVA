public interface IVisitor {
  void caseParagraph(Paragraph paragraph);

  void caseHeader(Header header);

  void caseImage(Image image);
}
