package AST;

public class Text extends Node{
     String attributeName;

    public Text(String attributeName) {
        this.attributeName = attributeName;
    }


    @Override
    public String toString() {
        return "\""+ attributeName +"\" ";
    }
}
