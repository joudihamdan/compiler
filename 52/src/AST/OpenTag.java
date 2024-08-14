package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends Node{
     String tagName;

     List<Node>  tag =new ArrayList<>();

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }


    public void addtagcontent (Node node){
        if(node!=null)
         tag.add(node);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(" tagName: ");
        stringBuilder.append(tagName);


            for (Node c : tag) {
                if (c != null) {
                stringBuilder.append(",");
                stringBuilder.append(" tag content: ");
                stringBuilder.append(c);
                stringBuilder.append("  ");
            }
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
