package AST;

import java.util.HashMap;
import java.util.Map;

public class StyleAttributes extends Node{
     Map<String,String> attributes=new HashMap<>();

 public void addAttribute(String identifier, String value) {
     attributes.put(identifier, value);
 }
    @Override
    public String generate() {
        String s="";
        if(attributes!=null){
            for (int i = 0; i < attributes.size(); i++) {
                s+=attributes.get(i);
            }
        }
        return  s;
    }

    @Override
    public String toString() {
        return "StyleAttributes{" + attributes +
                '}';
    }
}