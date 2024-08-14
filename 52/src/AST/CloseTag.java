package AST;

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

    @Override
    public String toString() {
        return "{" + " tagName='" + tagName + '\'' +
                '}';
    }
}
