package AST;

import java.util.ArrayList;
import java.util.List;

public class Element extends  Node{

    public List<IElement> elements =new ArrayList<>();


    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public void addElement(IElement element) {
        elements.add(element);
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
