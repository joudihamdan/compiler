package AST;

import java.util.ArrayList;
import java.util.List;

public class forloop extends Node {
    Declaration declaration;
    operation operation;
    List<Statement> statements = new ArrayList<>();

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public forloop() {
    }

    public void addStatement(Statement node) {
        statements.add(node);
    }

    public AST.operation getOperation() {
        return operation;
    }

    public void setOperation(AST.operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("\n"+" {"+"\n");
        stringBuilder.append(declaration);
        if(statements!=null) {
            stringBuilder.append(statements);
        }
        stringBuilder.append("\n"+"}"+"\n");
        return stringBuilder.toString();
    }
}
