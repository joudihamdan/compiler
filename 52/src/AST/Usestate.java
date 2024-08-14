package AST;

public class Usestate extends Node{
    String id;
    String funid;
    String usestate;

    ConstFunction constFunction;

    public void setConstFunction(ConstFunction constFunction) {
        this.constFunction = constFunction;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFunid(String funid) {
        this.funid = funid;
    }

    @Override
    public String toString() {
        return "{" +
                "Id='" + id + '\'' +
                ", FunctionId='" + funid + '\'' +
                '}';
    }
}
