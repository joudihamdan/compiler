package AST;

import java.util.List;

public class JSXElements extends Node{
     OpenTag openTag;
     TagContent tagContent;
     CloseTag closeTag;
     SelfClosingTag selfClosing;

    public JSXElements() {
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public TagContent getTagContent() {
        return tagContent;
    }

    public void setTagContent(TagContent tagContent) {
        this.tagContent = tagContent;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    public SelfClosingTag getSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(SelfClosingTag selfClosing) {
        this.selfClosing = selfClosing;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" {  ");
        stringBuilder.append("\n");
        if(openTag!=null){
        stringBuilder.append("      openTag="); stringBuilder.append(openTag);
        stringBuilder.append("\n");
        stringBuilder.append("      tagContent="); stringBuilder.append(tagContent);
        stringBuilder.append("\n");
        stringBuilder.append("      closeTag="); stringBuilder.append(closeTag);}
        if(selfClosing!=null){
            stringBuilder.append("      selfClosing="); stringBuilder.append(selfClosing);}
        return stringBuilder.toString();
    }
}
