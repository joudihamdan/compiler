package AST;

import java.util.ArrayList;
import java.util.List;

public class IF_Condition extends Node {
    List<ElseIf_Condition> elseIf;
    Else_condition else_condition;
    List<Statement> content = new ArrayList<>();

    public void addElseIF(ElseIf_Condition e) {
        elseIf.add(e);
    }

    public void addNode(Statement e) {
        content.add(e);
    }

    public void setElse_condition(Else_condition else_condition) {
        this.else_condition = else_condition;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n" + "   {");
        if (content != null) {
            stringBuilder.append("If Content :");
            for (Statement s : content) {
                if (s != null) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            }

            if (elseIf != null) {
                stringBuilder.append("Else If condition:");
                stringBuilder.append(elseIf);
                stringBuilder.append("\n");
            }
            if (else_condition != null) {
                stringBuilder.append(" Else :");
                stringBuilder.append(else_condition);
                stringBuilder.append("\n");
            }
            stringBuilder.append("}");


        }

        return stringBuilder.toString();
    }
}

