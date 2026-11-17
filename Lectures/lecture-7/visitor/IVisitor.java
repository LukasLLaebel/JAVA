public interface IVisitor {
    void caseParagraph (Paragraph p);
    void caseHeader (Header p);
    void caseImage (Image p);

}
