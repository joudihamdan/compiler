package AST;

import java.util.ArrayList;
import java.util.List;

public class Multiattribute extends Node implements IAttribute{

    private List<String> attributeNames =new ArrayList<>();

    public void addAttributeName(String attributeName) {
        attributeNames.add(attributeName);
    }

    public List<String> getAttributeNames() {
        return attributeNames;
    }

//    public String generateList(){
//        String s="";
//        for (int i = 0; i <attributeNames.size(); i++) {
//            s+=attributeNames;
//
//        }
//        return s;
//    }


    public  String generate(){
        String s="";
        s+= '{';
        for (int i=0;i<attributeNames.size();i++){
            s+=attributeNames.get(i);
        }
        s+= '}';
        return s;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Multiattribute");
        for (String c : attributeNames) {
            stringBuilder.append(c);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
