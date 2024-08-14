package AST;

public class WithHooks extends  Node{

    private ArrowComponent arrowComponent;
    private ComponentBody componentBody;
    private boolean isExported;

    public WithHooks(ArrowComponent arrowComponent, ComponentBody componentBody) {
        this.arrowComponent = arrowComponent;
        this.componentBody = componentBody;
    }

    public void setExported(boolean exported) {
        isExported = exported;
    }

    @Override
    public String toString() {
        return "WithUseState{" +
                "\n" +
                "arrowComponent=" + arrowComponent +
                "\n" +
                ", componentBody=" + componentBody +
                "\n" +
                ", isExported=" + isExported +
                '}';
    }
}
