package AST;

public class Text extends Node implements  IAttribute{
     String attributeName;

    public Text(String attributeName) {
        this.attributeName = attributeName;
    }


    @Override
    public String toString() {
        return "\""+ attributeName +"\" ";
    }
}
