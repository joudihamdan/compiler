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
    public String toString() {
        return "{" +tagcontent + " "+
                '}';
    }
}
