package AST;

import java.util.List;

public class Select extends  Node{
    private String identifier;
    JSXElements jsxElements;

    public Select(String identifier, JSXElements jsxElements) {
        this.identifier = identifier;
        this.jsxElements = jsxElements;
    }


    @Override
    public String generate() {
        String s="";
        s+=identifier +" "+ jsxElements.generate();
        return  s;
    }
    @Override
    public String toString() {
        return "Select{" +
                "identifier='" + identifier + '\'' +
                ", jsxElements=" + jsxElements +
                '}';
    }
}
