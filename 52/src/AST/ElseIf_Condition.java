package AST;

public class ElseIf_Condition extends Node{

    IF_Condition IF_Condition;

    public ElseIf_Condition(IF_Condition IF_Condition) {
        this.IF_Condition = IF_Condition;
    }

    @Override
    public String toString() {
        return "{" + IF_Condition + '}';
    }
}


