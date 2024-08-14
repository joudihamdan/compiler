package ErrorCheck;



import AST.Node;
import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Stack;

public class SemanticCheck {
    public static void checkHooksUsage(Symbol symbol1, int line, int id) {
        if(symbol1.getName().equals("Hooks")){
            if(!symbol1.getScope().getName().equals("Component Scope")){
                String error = "Error..! This hooks : " + symbol1.getType() + " can't used in this scope " + symbol1.getScope().getName() +" in line : " + line;
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            }
        }
    }

    public static void sameScopeRepeat(Symbol symbol1, int line, int id) {
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (s.empty()) {
            return;
        }
        Scope x = s.pop();
        System.out.println("scope:" + x.getId());
        for (Symbol symbol : x.getSymbolList()) {
            if (symbol.getName().equals("Variable")) {
                if (!symbol.equals(symbol1))
                    if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This var : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    StoreError.counter++;
                    s.push(x);
                    return;
                }
            } else if (symbol.getName().equals("Component")) {
                if (!symbol.equals(symbol1)) if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This Component : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    Main.logger.info(error);
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    StoreError.counter++;
                    s.push(x);
                    return;
                }
            }
        }
        sameScopeRepeat(symbol1, line, x.getId());
        s.push(x);
            }


    public static void checktypes(Symbol symbol, Node element, int line) {
        System.out.println(symbol.getType() + "+++" + element);
        if (Objects.equals(symbol.getType(), "int")) {
            System.out.println("intttttttt");
            System.out.println("hello");
            System.out.println(element.getNodeType());
            if (!element.getNodeType().equals("int") ) {
                String error = "Error..! This var : " + symbol.getValue() + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                StoreError.counter++;
                return;
            }

        }
        if (symbol.getType().equals("String")) {
            if (!element.getNodeType().equals("String")) {
                checkMatchVariableWithString(element, symbol, line);
                return;
            }
        }

    }
    public static void checkMatchVariableWithString(Node node, Symbol symbol, int line) {

        if (node.getNodeType().equals("IntegerLiteral") ) {

            String error = "Error..!  : " + node.getNodeType() + " Can't be assigned to " + symbol.getType() + " in line : " + line;
            Main.logger.info(error);
            return;
        }
        for (Node child : node.getChildren()) {
            checkMatchVariableWithString(child, symbol, line);
        }
    }
//
//    public static void NotDefineInCurrentScope(String symbol1, int line, int id) {
//        Stack<Scope> s = Main.symbolTable.getScopeStack();
//        if (SymbolTable.searchForClass(symbol1) || SymbolTable.searchInSpecialFuncations(symbol1)) {
//            System.out.println("test true");
//            return;
//        }
//        if (s.empty()) {
//            String error = "Error..! This var : " + symbol1 + " is not define inside scope" + " - Scope id : " + id + " in line : " + line;
//            Main.logger.info(error);
//            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
//            return;
//        }
//
//        Scope x = s.pop();
//        System.out.println("scope:" + x.getId());
//        for (Symbol symbol : x.getSymbolList()) {
//            if (symbol.getName().equals("Variable") ) {
//                if (symbol.getValue().equals(symbol1)) {
//                    System.out.println("test true");
//                    s.push(x);
//                    return;
//                }
//            } else if (symbol.getName().equals("Function")) {
//                if (symbol.getValue().equals(symbol1)) {
//                    System.out.println("test true");
//                    s.push(x);
//                    return;
//                }
//            }
//        }
//        NotDefineInCurrentScope(symbol1, line, x.getId());
//
//        s.push(x);
//    }
}



