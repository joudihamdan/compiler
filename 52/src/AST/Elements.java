package AST;

import java.util.ArrayList;
import java.util.List;

public class Elements extends Node {
    private List<Node> elements;

    public Elements() {

        elements = new ArrayList<>();
    }

    public void addElement(Node element) {
        elements.add(element);
    }

    public List<Node> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("{");
        stringBuilder.append("\n");

        for (Node c : elements) {
            if (c != null) {
                stringBuilder.append(" {");
                stringBuilder.append(c);
                stringBuilder.append("}");
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
