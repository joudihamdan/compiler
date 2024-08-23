package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentCall extends Node {
     private String name;
    private List<String>identifier =new ArrayList<>();
    private List<String> obj=new ArrayList<>();

    public ComponentCall() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public void addId(String id){
        if(id!=null)
            identifier.add(id);
  }
    public void addobject(String object){
        if(object!=null)
            obj.add(object);
    }


    public  String generateBody(){
        String s= "";
        s+=name;
        if (identifier!=null){
            for (int i = 0; i <identifier.size() ; i++) {
                s+=identifier.get(i).toString() +'='+obj.get(i).toString();
            }
        }
        return s;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ComponentCall {");
        stringBuilder.append("Name :");
        stringBuilder.append(name);
        stringBuilder.append(",Identifier : ");
            for (String c : identifier) {
                if(c!=null) {
                stringBuilder.append(c);
                stringBuilder.append(" ");
            }
        }
            stringBuilder.append(", Value : ");
            for (String c : obj) {
                if(c!=null){
                    stringBuilder.append(c);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
