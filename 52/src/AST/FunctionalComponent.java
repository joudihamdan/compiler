package AST;

public class FunctionalComponent extends Node{
    private String componentName;

    Openpraces openpraces;

    public FunctionalComponent(String componentName,Openpraces openpraces) {
        this.componentName = componentName;
        this.openpraces=openpraces;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public String generate() {
        String s="";
        s+="function "+openpraces.generate();
        return s;
    }

    @Override
    public String toString() {
        return "FunctionalComponent{" +
                "componentName='" + componentName + '\'' +
                ", openpraces=" + openpraces +
                '}';
    }
}
