import java.util.ArrayList;

public class Document {
  void addElement(DocumentElement element) {
    elements.add(element);
  }

  public void writeHTML() {
    var visitor = new HTMLOutputter();
    for (var element : elements) {
      element.accept(visitor);
    }
  }

  private ArrayList<DocumentElement> elements = new ArrayList<DocumentElement>();
}
