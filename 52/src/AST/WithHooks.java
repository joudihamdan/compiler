package AST;

import java.lang.ref.SoftReference;

public class WithHooks extends  Node{

    private ArrowComponent arrowComponent;
    private ComponentBody componentBody;
    private boolean isExported;

    public WithHooks(ArrowComponent arrowComponent, ComponentBody componentBody) {
        this.arrowComponent = arrowComponent;
        this.componentBody = componentBody;
    }

    public void setExported(boolean exported) {
        isExported = exported;
    }
public String generateList(String listName){
    String s="";

    if (componentBody != null) {
        s += listName + ".forEach(product => {";
        s += componentBody.generateList("productList");
    }
   s+= arrowComponent.generatewith("showProductDetails");
    s+=componentBody.generatewith("product");
   s+="\n}";
    return s;
}
    @Override
    public String toString() {
        return "WithUseState{" +
                "\n" +
                "arrowComponent=" + arrowComponent +
                "\n" +
                ", componentBody=" + componentBody +
                "\n" +
                ", isExported=" + isExported +
                '}';
    }
}
