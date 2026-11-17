public class Image extends DocumentElement {
    public Image (String h) {
	path = h;
    }

    void writeHTML () {
	System.out.println (String.format ("<img src='%s'>",path));
    }
    
    public String getPath () {return path;}
    void accept (IVisitor iv) {iv.caseImage(this);}
    
    private String path;
}
