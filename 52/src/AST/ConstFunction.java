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

    public String generate1(String st) {
        String s="";
        s+= functionname +"( "+") "+"{"+"\n"+call.generate(st)+"\n"+"}"+"\n";
        return  s;
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
