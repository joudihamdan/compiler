package AST;

public interface IAssignment {
    public String generate();

    //    Identifier ID =new Identifier();
    public Identifier getID();
    public void setID(Identifier id);
}
