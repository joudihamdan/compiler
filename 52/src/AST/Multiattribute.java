package AST;

import java.util.ArrayList;
import java.util.List;

public class Multiattribute extends Node {

    private List<String> attributeNames =new ArrayList<>();

    public void addAttributeName(String attributeName) {
        attributeNames.add(attributeName);
    }

    public List<String> getAttributeNames() {
        return attributeNames;
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
