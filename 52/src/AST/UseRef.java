package AST;

public class UseRef extends Node{
   String variablr;
   Openpraces openpraces;

    public UseRef(String variablr, Openpraces openpraces) {
        this.variablr = variablr;
        this.openpraces = openpraces;
    }

    @Override
    public String generate() {
        String s="";
        s+= variablr;
        s+=openpraces.generate();
        return  s;
    }

    @Override
    public String toString() {
        return "UseRef{" +
                "variablr='" + variablr +
                ", openpraces=" + openpraces +
                '}';
    }
}
