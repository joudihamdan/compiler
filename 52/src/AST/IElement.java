package AST;

public class IElement extends Node{
     String identifier;
     String value;

    public IElement(String identifier, String value) {
        this.identifier = identifier;
        this.value = value;
    }

    @Override
    public String toString() {
        return " " +
                "key='" + identifier + '\'' +
                ",value='" + value + '\'' +
                ' ';
    }
}
