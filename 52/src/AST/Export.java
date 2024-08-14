package AST;

public class Export extends  Node{
    private String componentname;

    public Export(String componentname) {
        this.componentname = componentname;
    }

    public String getComponentname() {
        return componentname;
    }

    public void setComponentname(String componentname) {
        this.componentname = componentname;
    }

    @Override
    public String toString() {
        return "Export{" +
                "componentname='" + componentname + '\'' +
                '}';
    }
}
