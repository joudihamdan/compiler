package AST;

import java.util.ArrayList;
import java.util.List;

public class TagContent extends  Node{
   List<Node> tagcontent=new ArrayList<>();


    public void addnode (Node node){
        if (node!=null)
            tagcontent.add(node);
    }

    @Override
    public String generate() {
        String s="";
        if(tagcontent!=null){
            for (int i = 0; i < tagcontent.size(); i++) {
                s+=tagcontent.get(i).generate();
            }
        }
        return  s;
    }

    public String generateList() {
        String s="";
       s+="() => showProductDetails(product));\n";
        return  s;
    }
    @Override
    public String toString() {
        return "{" +tagcontent + " "+
                '}';
    }
}
