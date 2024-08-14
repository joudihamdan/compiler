package AST;

import java.util.HashMap;
import java.util.Map;

public class StyleAttributes extends Node{
     Map<String,String> attributes=new HashMap<>();

 public void addAttribute(String identifier, String value) {
     attributes.put(identifier, value);
 }

    @Override
    public String toString() {
        return "StyleAttributes{" + attributes +
                '}';
    }
}