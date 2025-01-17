package AST;

public class ExpressionAssignment extends Assignment{

    String id;
    Expression expression;

    public ExpressionAssignment(String id, Expression expression) {
        this.id = id;

        this.expression = expression;
    }


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return
                " id= " + id + '\'' +
                " expression= " + expression
                ;
    }
}
