package AST;

public class Map extends Node{
    private Openpraces openpraces;
    private JSXElements jsxElements;

    public Map(Openpraces openpraces, JSXElements jsxElements) {
        this.openpraces = openpraces;
        this.jsxElements = jsxElements;
    }

    public Openpraces getOpenpraces() {
        return openpraces;
    }

    public void setOpenpraces(Openpraces openpraces) {
        this.openpraces = openpraces;
    }

    public JSXElements getJsxElements() {
        return jsxElements;
    }

    public void setJsxElements(JSXElements jsxElements) {
        this.jsxElements = jsxElements;
    }

    @Override
    public String generate() {
        String s ="";
        s+=openpraces.generate() + jsxElements.generate();
        return s;
    }
    @Override
    public String toString() {
        return "Map{" +
                "openpraces=" + openpraces +
                ", jsxElements=" + jsxElements +
                '}';
    }
}
