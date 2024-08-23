package AST;

import java.util.ArrayList;
import java.util.List;

public class UseEffect extends Node{
    Function function;
    List<Statement> st =new ArrayList<>();


    public void setFunction(Function function) {
        this.function = function;
    }

    public void addStat(Statement statement){
        st.add(statement);
    }


//    @Override
//    public String generate() {
//        String s="";
//        s+=function.generate() ;
//        if(st!=null){
//            for (int i = 0; i < st.size(); i++) {
//                s+= st.get(i).generate();
//            }
//
//        }
//        if(at!=null){
//            for (int i = 0; i < at.size(); i++) {
//                s+=at.get(i).generate();
//            }
//        }
//        return  s;
//    }
    @Override
    public String toString() {

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("UseEffect { ");
        stringBuilder.append(function);
        for (Statement s : st){
        if(s!=null) {
            stringBuilder.append(s);
        }
        }
         return stringBuilder.toString();
        }
    }

