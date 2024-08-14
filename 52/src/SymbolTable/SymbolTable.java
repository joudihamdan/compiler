package SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    private final ArrayList<Scope> scopes = new ArrayList<>();

    private final Stack<Scope> scopeStack = new Stack<>();

    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

}
