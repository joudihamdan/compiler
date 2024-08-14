package AST;

public class Assignment extends Node{
    ExpressionAssignment ExpressionAssignment;
    literalAssignment literalAssignment;


    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        if (literalAssignment!=null){
            stringBuilder.append("{ ");
            stringBuilder.append(literalAssignment);
        }
        if(ExpressionAssignment!=null){
            stringBuilder.append("{ ");
            stringBuilder.append(ExpressionAssignment);
        }
        stringBuilder.append(" } ");

        return stringBuilder.toString();
    }


}
