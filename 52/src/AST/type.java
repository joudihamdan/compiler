package AST;

import org.antlr.v4.runtime.tree.TerminalNode;

public class type extends Node {
String type;

    public type(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }

    @Override
    public String generate() {
        String s="let ";
        return s;
    }

    @Override
    public String toString() {
        return  type + " ";
    }
}
