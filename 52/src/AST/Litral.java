package AST;

public class Litral extends  Node{
    String value;

    public Litral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " -> "+ value ;
    }
}
