package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrowComponent extends Node{
    private String componentName;
    private  Openpraces openpraces;
    ComponentBody componentBody;

    public void setComponentBodyList(ComponentBody componentBodyList) {
        this.componentBody = componentBody;
    }

    public ArrowComponent(String componentName, Openpraces openpraces ) {
        this.componentName = componentName;
        this.openpraces = openpraces;
    }

    public  String generate1(String listName) {
        String s="";
                s+= "\n ";
        if (Objects.equals(componentName, "productList")) {
            s += "const " + componentName + "=" + "document.getElementById";
            s += openpraces.generateList("product-list");
            s += "\n";
            String att = "";
            String name = "";
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    name = "productName";
                    att = "product-name";
                    s += "const " + name + "=" + "document.getElementById ";
                    s += openpraces.generateList(att);
                    s += "\n";

                }
                if (i == 1) {
                    name = "productImage";
                    att = "product-image";
                    s += "const " + name + "=" + "document.getElementById";
                    s += openpraces.generateList(att);
                    s += "\n";

                }
                if (i == 2) {
                    name = "productDescription";
                    att = "product-description";
                    s += "const " + name + "=" + "document.getElementById";
                    s += openpraces.generateList(att);
                    s += "\n";

                }
            }
        }
      //  s+=openpraces.generateAtt();

        return  s;
    }

    public  String generatewith(String listName){
        String s="";
        s+="function "+listName +openpraces.generateList("product") + "{";

        return  s;
    }

    public  String generate(){
        String s="";
        s += componentName +" " + openpraces.generate();
        return s;
    }


    @Override
    public String toString() {
        return "{" +
                "componentName :'" + componentName + '\'' +
                ", openpraces=" + openpraces + "componentBody:\n"+ componentBody+"}";
    }
}
