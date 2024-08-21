package AST;

public class Selectattribute extends Node implements IAttribute {
    private Select select;

    public Selectattribute(Select select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "SelectAttribute {" + select +
                '}';
    }
}
