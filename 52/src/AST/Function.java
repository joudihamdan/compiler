package AST;

public class Function extends  Node{
  private Openpraces openpraces;
  private  call call;

    public Function(Openpraces openpraces) {
        this.openpraces = openpraces;
    }

    public Openpraces getOpenpraces() {
        return openpraces;
    }

    public void setOpenpraces(Openpraces openpraces) {
        this.openpraces = openpraces;
    }

    public AST.call getCall() {
        return call;
    }

    public void setCall(AST.call call) {
        this.call = call;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Function { ");
        stringBuilder.append("openpraces : ");
        stringBuilder.append(openpraces);
        if(call!=null) {
            stringBuilder.append("Call : ");
            stringBuilder.append(call);
        }
        stringBuilder.append(" } ");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
