package AST;

import java.util.ArrayList;
import java.util.List;

public class program extends Node {


    list list;
     WithHooks withHooks;
     List<ArrowComponent> singleComponentlist=new ArrayList<>();
     SingleComponent Component;
    List<Statement> statement=new ArrayList<>();
    Hooks hooks;

    public void setHooks(Hooks hooks) {
        this.hooks = hooks;
    }

    public AST.list getList() {
        return list;
    }

    public void setList(AST.list list) {
        this.list = list;
    }

    public WithHooks getWithUseState() {
        return withHooks;
    }

    public void setWithUseState(WithHooks withHooks) {

        this.withHooks = withHooks;
    }

    public void addArrowComponent(ArrowComponent single) {
        if(single!=null)
            singleComponentlist.add(single);
    }

    public  void addStatement (Statement s){
        if(s!=null)
            statement.add(s);
    }
    public SingleComponent getComponent() {
        return Component;
    }

    public void setComponent(SingleComponent component) {
        Component = component;
    }

    @Override
    public String generate() {
        String s="";
        if(singleComponentlist!=null){
            for (int i = 0; i < singleComponentlist.size() ; i++) {
                s+=singleComponentlist.get(i).generate();
            }
            s+=withHooks.generate();
        }
        if(Component!=null){
            s+= Component.generate();
        }
        return  s;
    }


    public  String generateList(){
        String s="";
        if (list!=null){
            s+=list.generate();
        }
        if(singleComponentlist!=null){
            for (int i = 0; i < singleComponentlist.size() ; i++) {
                s+=singleComponentlist.get(i).generate1(list.identifier);

            }
        }
        if(withHooks!=null)
        s+=withHooks.generateList(list.identifier);

        return  s;

    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(list!=null) {
            stringBuilder.append(list);
            stringBuilder.append("\n");
            if (singleComponentlist != null) {
                for (ArrowComponent s : singleComponentlist) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            }
        }
        if(withHooks!=null){
            stringBuilder.append(withHooks);
            stringBuilder.append("\n");
        }
        if(Component!=null){
            stringBuilder.append(Component);
            stringBuilder.append("\n");
        }
        if(statement!=null){
            stringBuilder.append(statement);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();

    }
}