public class HTMLOutputter implements IVisitor {
    public void caseParagraph (Paragraph p)  {
	System.out.println (String.format ("<p> %s </p>",p.getText()));
    
    }

    public void caseHeader (Header p) {
	System.out.println (String.format ("<h1> %s </h1>",p.getHeadText()));
	
    }
    public void caseImage (Image p) {
	System.out.println (String.format ("<img src='%s'>",p.getPath()));
    }
    
}
