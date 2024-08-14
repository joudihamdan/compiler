package AST;

import org.antlr.v4.runtime.tree.TerminalNode;

public class type extends Node {
String type;

    public type(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return  type + " ";
    }
}
