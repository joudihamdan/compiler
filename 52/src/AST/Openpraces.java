package AST;

import java.util.ArrayList;
import java.util.List;

public class Openpraces extends Node{

  List<IAttribute> attributes=new ArrayList<>();
  List <String> statment=new ArrayList<>();


  public void addStatment(String st) {
    statment.add(st);
  }

  public void addAttributes(IAttribute node) {
    attributes.add(node);
  }

  @Override
  public String generate(){
    String a = "";
    if(statment!=null){
      for (int i = 0; i < statment.size(); i++) {
        a+=statment.get(i);
      }
    }
    return  a;
  }

  public String generateList(String att){
    String s = "";

    if(att=="product")
    {
      s+="("+att+")\n";
    }
   else{
      s+="( \'";
      s+=att;
      s+="\' ); \n";
    }

    return  s;
  }



  public String generateAtt(){
    String a = "";
    if(attributes!=null){
      for (int i = 0; i < attributes.size(); i++) {
        a+=attributes.get(i);
      }
    }
    return  a;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" {");

    for (IAttribute c : attributes) {
      if(c!=null){
        stringBuilder.append(c);
      }
    }

      if(!statment.isEmpty()){
        stringBuilder.append(statment);}

    stringBuilder.append("}");
    return stringBuilder.toString();

  }
}
