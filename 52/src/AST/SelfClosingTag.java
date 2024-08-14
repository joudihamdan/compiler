package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Node{
    private String tagName;
    List <Node> attributes=new ArrayList<>();

    public SelfClosingTag(String tagName ) {
        this.tagName = tagName;

    }
    public  void addattribute(Node node){
        attributes.add(node);
    }
    @Override
    public String toString() {
        return "SelfClosingTag{" +
                "Name='" + tagName + '\'' +
                ", Attributes=" + attributes +
                '}';
    }
}
