package AST;

public class call  extends Node {

       String functionname;
       Openpraces openpraces;


    public call(String functionname, Openpraces openpraces) {
        this.functionname = functionname;
        this.openpraces = openpraces;
    }


    @Override
    public String toString() {
        return "{" +
                "functionName='" + functionname + '\'' +
                ", openpraces=" + openpraces +
                '}';
    }
}
