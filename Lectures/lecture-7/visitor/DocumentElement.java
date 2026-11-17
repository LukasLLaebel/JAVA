public abstract class DocumentElement {
    abstract void writeHTML ();
    abstract void accept (IVisitor iv);
}
