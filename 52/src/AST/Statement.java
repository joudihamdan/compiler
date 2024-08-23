package AST;

import java.util.ArrayList;
import java.util.List;

public class Statement extends Node {
    List<Declaration> declaration = new ArrayList<>();
    forloop f;
    IF_Condition ifc;
    call call;

    public void setCall(AST.call call) {
        this.call = call;
    }

    public void setF(forloop f) {
        this.f = f;
    }

    public void setIfc(IF_Condition ifc) {
        this.ifc = ifc;
    }

    public void addDeclaration(Declaration d) {
        declaration.add(d);
    }
    @Override
    public String generate() {
        String s="";
        for (int i = 0; i < declaration.size(); i++) {
            s+=declaration.get(i).generate();
        }

        if(f!=null){
            s+=f.generate();
        }
        if(ifc!=null){
            s+=ifc.generate();
        }
        if(call!=null){
            s+=call.generate();
        }
        return  s;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Statement :");
        stringBuilder.append("\n");
        if (declaration != null) {
             for (Declaration s:declaration)
                stringBuilder.append(s);
            }

        if (f != null) {
            stringBuilder.append("  For Loop :");
            stringBuilder.append(f);
        }

        if (ifc != null) {
            stringBuilder.append("  If Statement :");
            stringBuilder.append(ifc);
        }
        if(call!=null){
            stringBuilder.append("  Function call");
            stringBuilder.append(call);
        }
        stringBuilder.append( " }");

        return stringBuilder.toString();

    }
}
