package AST;

public class IElement extends Node{
     String identifier;
     ILiteral value;

    public IElement(String identifier, ILiteral value) {
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
