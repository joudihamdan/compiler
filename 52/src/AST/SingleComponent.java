package AST;

public class SingleComponent extends  Node{
    private FunctionalComponent functionalComponent;
    private ArrowComponent arrowComponent;
    private ComponentBody componentBody;


    public void setFunctionalComponent(FunctionalComponent functionalComponent) {
        this.functionalComponent = functionalComponent;
    }


    public void setArrowComponent(ArrowComponent arrowComponent) {
        this.arrowComponent = arrowComponent;
    }


    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        if(functionalComponent!=null) {
            stringBuilder.append(" { ");
            stringBuilder.append("functionalComponent: ");
            stringBuilder.append(functionalComponent);
        }
        if(arrowComponent!=null) {
            stringBuilder.append("ArrowComponent: ");
            stringBuilder.append(arrowComponent);
        }
        stringBuilder.append(" \n");
        stringBuilder.append("ComponentBody: ");
        stringBuilder.append(componentBody);
        stringBuilder.append(" } ");
        return stringBuilder.toString();
    }
}
