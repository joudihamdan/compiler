package AST;

public class literalAssignment extends Assignment{
    String id;
    Litral Litral;



    public AST.Litral getLitral() {
        return Litral;
    }

    public void setLitral(AST.Litral Litral) {
        this.Litral = Litral;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "id = " + id +  ','+
                "value=" + Litral
                ;
    }
}
