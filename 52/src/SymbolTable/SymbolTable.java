package SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    private ArrayList<Scope> scopes = new ArrayList<>();
    private static ArrayList<String> classess=new ArrayList<>();
    private static ArrayList<String> specialFunction = new ArrayList<>();

    private Stack<Scope> scopeStack = new Stack<>();

    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }
    public static boolean searchForClass(String clas){
        return classess.contains(clas);
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }
    public static boolean searchInSpecialFuncations(String function){
        return specialFunction.contains(function);
    }


    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

}
