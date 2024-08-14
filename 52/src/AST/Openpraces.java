package AST;

import java.util.ArrayList;
import java.util.List;

public class Openpraces extends Node{

   List<Node> attributes=new ArrayList<>();
   String s;


  public void setS(String s) {
    this.s = s;
  }

  public void addAttributes(Node node) {
    attributes.add(node);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" {");

    for (Node c : attributes) {
      if(c!=null){
      stringBuilder.append(c);
    }
    }

    if(s!=null)
      stringBuilder.append(s);
    stringBuilder.append("}");
    return stringBuilder.toString();

  }
}
