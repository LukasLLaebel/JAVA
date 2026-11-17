import java.util.ArrayList;

public class Document {

    
    
    void addElement (DocumentElement e) {
	elements.add (e);
    }

    public void writeHTML () {
	var iv = new HTMLOutputter ();
	for (var e : elements) {
	    e.accept (iv);
	}
    }
    
    private ArrayList<DocumentElement> elements = new ArrayList<DocumentElement> ();
    
}
