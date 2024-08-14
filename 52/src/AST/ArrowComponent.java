package AST;

public class ArrowComponent extends Node{
    private String componentName;
    private  Openpraces openpraces;

    public ArrowComponent(String componentName, Openpraces openpraces) {
        this.componentName = componentName;
        this.openpraces = openpraces;
    }

    public Openpraces getOpenpraces() {
        return openpraces;
    }

    public void setOpenpraces(Openpraces openpraces) {
        this.openpraces = openpraces;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }


    @Override
    public String toString() {
        return "{" +
                "componentName :'" + componentName + '\'' +
                ", openpraces=" + openpraces + "}";
    }
}
