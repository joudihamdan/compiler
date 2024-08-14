package AST;


public class literalAssignment extends Node implements IAssignment {
    private Identifier ID;
    private ILiteral literal;

    public void setLiteral(ILiteral literal) {
        this.literal = literal;
        this.addNodeChild((Node) literal);
    }

    public ILiteral getLiteral() {
        return this.literal;
    }

    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "LiteralAssignment{" +
                "ID='" + ID + '\'' +
                ", literal=" + literal +
                '}';
    }
}
