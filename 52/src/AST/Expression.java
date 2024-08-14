package AST;

public class Expression extends Node{
    operation operation;

    public Expression(AST.operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "expression {" + operation + '}';
    }
}
