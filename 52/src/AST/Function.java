package AST;

public class Function extends  Node{

    String functionName;
  private Openpraces openpraces;
  private  call call;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

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
    public String generate() {
        String s="";
        s+= "("+ getFunctionName() +")";
        if (call!=null){
            s+= call.generate();
        }
        return s;
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
