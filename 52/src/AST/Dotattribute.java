package AST;

import java.util.List;

public class Dotattribute extends Node {

     String id1;
     Node dotid;

    public Dotattribute(String id1, Node dotid) {
        this.id1 = id1;
        this.dotid = dotid;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public Node getDotid() {
        return dotid;
    }

    public void setDotid(Node dotid) {
        this.dotid = dotid;
    }



    @Override
    public String toString() {
        return "Dotattribute{" +
                "id1='" + id1 + '\'' +
                ", id2='" + dotid + '\'' +
                '}';
    }
}
