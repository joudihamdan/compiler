package AST;

public class operation extends Node {
    String id;
    String value;

    public operation(String id, String value) {
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
