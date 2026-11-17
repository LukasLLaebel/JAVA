public class Header extends DocumentElement {
    public Header (String h) {
	head_text = h;
    }

    void writeHTML () {
	System.out.println (String.format ("<h1> %s </h1>",head_text));
    }
    
    public String getHeadText () {return head_text;}
    void accept (IVisitor iv) {iv.caseHeader(this);}
    
    private String head_text;
}
