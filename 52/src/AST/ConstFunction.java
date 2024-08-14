package AST;

public class ConstFunction extends Node {

    private String functionname;

    private  Openpraces openpraces;
    private  call call;

    public ConstFunction(String functionname, Openpraces openpraces, AST.call call) {
        this.functionname = functionname;
        this.openpraces = openpraces;
        this.call = call;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public Openpraces getOpenpraces() {
        return openpraces;
    }

    public void setOpenpraces(Openpraces openpraces) {
        this.openpraces = openpraces;
    }

    public AST.call getCall() {
        return call;
    }

    public void setCall(AST.call call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "ConstFunction{" +
                "functionname='" + functionname + '\'' +
                ", openpraces=" + openpraces +
                ", call=" + call +
                '}';
    }
}
