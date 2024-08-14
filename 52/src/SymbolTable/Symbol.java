package SymbolTable;

import Main.Main;

public class Symbol {
    private String name;
    private String type;
    private String value;
    private Scope scope;
    private int lineNumber;

    public static Symbol createSymbol(int ScopeId, String name, String type, String value,int lineNumber) {
        System.out.println("create new Symbol ...");
        Symbol symbol = new Symbol();
        symbol.setName(name);
        symbol.setType(type);
        symbol.setValue(value);
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addSymbol(symbol);
        symbol.setLineNumber(lineNumber);
        System.out.println("name: " + name + "      type: " + type + "      value: " + value + "    scope name: " + scope.getName());
        return symbol;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    public void print() {
        int symbolName = 8;
        int symbolType = 6;
        int symbolValue = 10;

        String stringBuilder = "\t\t" +
                " - Symbol Name: " + this.getName() +
                " ".repeat(Math.max(0, symbolName - this.getName().length())) +
                "\t" +
                " - Symbol Type: " + this.getType() +
                " ".repeat(Math.max(0, symbolType - this.getType().length())) +
                "\t" +
                " - Symbol Value: " + this.getValue() +
                " ".repeat(Math.max(0, symbolValue - this.getValue().length())) +
                "\t" +
                " - Scope Id: " + this.getScope().getId() +
                "\t" +
                " - Scope Name: " + this.getScope().getName();
        System.out.println(stringBuilder);

    }
}
