package AST;

public class operation extends Node {
    String id;
    ILiteral value;

    public operation(String id, ILiteral value) {
        this.id = id;

        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "identifier='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
