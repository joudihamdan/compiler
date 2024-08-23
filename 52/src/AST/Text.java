package AST;

public class Text extends Node implements  IAttribute{
     String attributeName;

    public Text(String attributeName) {
        this.attributeName = attributeName;
    }

    public  String generate(){
        String s="";
        s+=attributeName+" ";
        return  s;
    }

    @Override
    public String toString() {
        return "\""+ attributeName +"\" ";
    }
}
