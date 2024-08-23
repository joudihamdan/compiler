package AST;

import java.util.Objects;

public class CloseTag extends Node{
     String tagName;

    public CloseTag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public String generateBody()
    {String s="";
        if(Objects.equals(tagName, "div")){
            s+="";
        }
        else{
            s+="</"+tagName+"> \n" ;}
        return  s;
    }
    @Override
    public String toString() {
        return "{" + " tagName='" + tagName + '\'' +
                '}';
    }
}
