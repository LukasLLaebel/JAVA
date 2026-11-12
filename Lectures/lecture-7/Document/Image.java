public class Image extends DocumentElement {
  public Image(String path) {
    path = h
  }

  void writeHTML() {
    System.out.println("<img src=\"" + path + "\" />");
  }

  public String getPath() {
    return path;
  }

  private String path;
}
