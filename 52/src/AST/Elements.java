package AST;

import java.util.ArrayList;
import java.util.List;

public class Elements extends Node {
    private List<Node> maps;
    private List<ILiteral> literals;



    public void addElement(Node element) {
        maps.add(element);
    }
    public void addLiteral(ILiteral literal) {
        literals.add(literal);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("{");
        stringBuilder.append("\n");
       if(maps!=null){
           for (Node c : maps) {
               if (c != null) {
                   stringBuilder.append(" {");
                   stringBuilder.append(c);
                   stringBuilder.append("}");
                   stringBuilder.append("\n");
               }
           }
       }
        if(literals!=null){
            for (ILiteral c : literals) {
                if (c != null) {
                    stringBuilder.append(" {");
                    stringBuilder.append(c);
                    stringBuilder.append("}");
                    stringBuilder.append("\n");
                }
            }
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
