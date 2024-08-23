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
    public  String generate(){
        String s="";
        if (hooks!=null){
            s+=hooks.generate();
        }
        s+=jsxElements.generate();
        return  s;
    }
public String generateList(String listName){
        String s="\nconst li = document.createElement('li');\n";
        s+= jsxElements.generateList("li",listName);
        return  s;

}
    public String generatewith(String object){
      String s="";
      s+= "productName.textContent ="+ object+".name;";
      s+="\n";
        s+= "productImage.src ="+ object+".image;";
        s+="\n";
        s+= "productImage.alt ="+ object+".name;";
        s+="\n";
        s+= "productDescription.textContent ="+ object+".description;";
        s+="\n";
        return  s;

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
