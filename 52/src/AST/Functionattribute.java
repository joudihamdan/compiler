package AST;

public class Functionattribute extends  Node{
      Function function;

    public Functionattribute(Function function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Functionattribute{" +
                "function=" + function +
                '}';
    }
}
