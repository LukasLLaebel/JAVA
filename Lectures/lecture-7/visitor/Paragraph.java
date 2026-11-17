public class Paragraph extends DocumentElement {
    public Paragraph (String h) {
	text = h;
    }

    void writeHTML () {
	System.out.println (String.format ("<p> %s </p>",text));
    }
    
    public String getText () {return text;}
    public void accept (IVisitor iv) {iv.caseParagraph(this);}
    
    private String text;
}
