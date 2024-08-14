package AST;


public class list extends Node {
     String identifier;
     Node e;

    public String getIdentifier() {
        return identifier;
    }

    public list(String identifier, Node e) {
        this.identifier = identifier;
        this.e = e;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }



    @Override
    public String toString() {
        return "list_name {" + identifier + '\'' +
                ", Elements=" + e + '}';
    }
}
