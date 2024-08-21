package AST;

import java.util.ArrayList;
import java.util.List;

public class Element extends  Node{
//    public List<String> ids =new ArrayList<>();
//    public ArrayList<ILiteral> literals =new ArrayList<>();

public void addElement(IElement element) {
    elements.add(element);
}
//
//
  public List<IElement> elements =new ArrayList<>();
//
//
//
//    public void addIds(String id) {
//        ids.add(id);
//    }
//    public void addLiterals(ILiteral literal) {
//        literals.add(literal);
//    }
//


    public  String generate(){
        String s="";
        s+="{ \n";
        if(elements!=null){
            int i=0;
            for ( i = 0; i < elements.size(); i++) {
                s+= elements.get(i).generate();

            }
            s+= " } ";
        }
        return  s;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (IElement c : elements) {
            stringBuilder.append(c);
            stringBuilder.append(",");
        }
        return stringBuilder.toString();

    }
}
