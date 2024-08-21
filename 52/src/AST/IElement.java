package AST;

public class IElement extends Node{
     String identifier;
     ILiteral value;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setValue(ILiteral value) {
        this.value = value;
    }

    public IElement(String identifier, ILiteral value) {
        this.identifier = identifier;
        this.value = value;
    }

    public String generate(){
        String s="";
        s+= "\t\t"+identifier + ":"+ value.generate() +",";
        s+="\n";
        return  s;
    }
    @Override
    public String toString() {
        return " " +
                "key='" + identifier + '\'' +
                ",value='" + value + '\'' +
                ' ';
    }
}
