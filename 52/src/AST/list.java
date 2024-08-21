package AST;


public class list extends Node {
     String identifier;
     Elements elements;

    public String getIdentifier() {
        return identifier;
    }

    public list(String identifier, Elements e) {
        this.identifier = identifier;
        this.elements = e;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

public  String generate(){
        String s= "";
        s+="const "+identifier+ "= [ \n ";
        s+=elements.generate();
        s+=" ]; \n";
         return  s;

}

    @Override
    public String toString() {
        return "list_name {" + identifier + '\'' +
                ", Elements=" + elements + '}';
    }
}
