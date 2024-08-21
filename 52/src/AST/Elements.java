package AST;

import java.util.ArrayList;
import java.util.List;

public class Elements extends Node {
    private List<Element> maps=new ArrayList<>();
    private ArrayList<ILiteral> literals=new ArrayList<>();



    public void addElement(Element element) {
        maps.add(element);
    }
    public void addLiteral(ILiteral literal) {
        literals.add(literal);
    }

    public  String generate(){
        String s="";
        if(maps!=null){
            for (int i = 0; i < maps.size(); i++) {
                s+=maps.get(i).generate();

                if(i !=maps.size()-1){
                    s+= ",\n";
                }
            }
        }
return  s;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("{");
        stringBuilder.append("\n");
       if(maps!=null){
           for (Element c : maps) {
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
