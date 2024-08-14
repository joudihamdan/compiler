package AST;

import java.util.ArrayList;
import java.util.List;

public class Else_condition extends Node{
List<Statement> statements=new ArrayList<>();
public void addStatement(Statement s){
    statements.add(s);
}

    @Override
    public String toString() {
        StringBuilder stringBuilder =new StringBuilder();

        for (Statement s:statements){
            if(s!=null){
            stringBuilder.append(s);
        }
        }
        return stringBuilder.toString();
    }
}
