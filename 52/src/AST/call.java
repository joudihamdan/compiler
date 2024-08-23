package AST;

public class call  extends Node {

       String functionname;
       Openpraces openpraces;


    public call(String functionname, Openpraces openpraces) {
        this.functionname = functionname;
        this.openpraces = openpraces;
    }

    public String generate(String st){
        String s ="";
        s+=functionname + '('+ st+");";
        return  s;
    }

    @Override
    public String toString() {
        return "{" +
                "functionName='" + functionname + '\'' +
                ", openpraces=" + openpraces +
                '}';
    }
}
