package AST;

public class Style extends  Node{
    StyleAttributes st;

    public Style(StyleAttributes st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return "Style {" + st +
                '}';
    }
}
