public abstract class DocumentElement {
  void writeHTML();

  void accept(IVisitor visitor);
}
