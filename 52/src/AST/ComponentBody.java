package AST;


public class ComponentBody extends Node{

    Hooks hooks;
  private  JSXElements jsxElements;

    public void setHooks(Hooks hooks) {
        this.hooks = hooks;
    }

    public ComponentBody(JSXElements jsxElements) {
        this.jsxElements = jsxElements;
    }

    public JSXElements getJsxElements() {
        return jsxElements;
    }

    public void setJsxElements(JSXElements jsxElements) {
        this.jsxElements = jsxElements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" { ");
        stringBuilder.append("\n");
        if (hooks != null) {
            stringBuilder.append(hooks);
        }
        stringBuilder.append("\n");
        stringBuilder.append(" JsxElement : ");
        stringBuilder.append("\n");
        stringBuilder.append(jsxElements);
        stringBuilder.append("\n");
        stringBuilder.append(" } ");

        return stringBuilder.toString();
    }
}
