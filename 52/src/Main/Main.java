package Main;

import AST.program;
import ErrorCheck.ErrorSyntax;
import ErrorCheck.StoreError;
import Grammar.ReactLexer;
import Grammar.ReactParser;
import SymbolTable.SymbolTable;
import genaration.Generator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import  Visitor.BaseVisitor;
import SymbolTable.Scope;
import SymbolTable.Symbol;



public class Main {
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static Logger logger = Logger.getLogger("MyLog");
    public static int errorCount=0;

    public static SymbolTable symbolTable = new SymbolTable();

    public static void main(String[] args) {
        FileHandler fh;
        try {
            fh = new FileHandler("ErrorsLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        try {
            String source = "52/Tests/test 2";
            CharStream cs = fromFileName(source);
            ReactLexer lexer = new ReactLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            ReactParser parser = new ReactParser(token);

            //Syntax Error Handling
            parser.removeErrorListeners();
            parser.addErrorListener( ErrorSyntax.INSTANCE);

           ParseTree tree = parser.program();
//            BaseVisitor s= new BaseVisitor();
//            System.out.println(s.visit(tree).toString());
          // if (StoreError.errorList.isEmpty()) {
                 BaseVisitor s = new BaseVisitor();
                program program = (program) s.visit(tree);
                System.out.println(program.toString());
//
                Generator codeGeneration=new Generator();
                codeGeneration.startGenerate(program);
////
//            } else {
//                ErrorSyntax.writeErrorsOnFile();
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

            //-------------------------- Symbol Table -------------------------------------
        System.out.println("------------------------- Symbol Table -------------------------");
        System.out.println("Number of Scopes in the program : " + Scope.getContId());
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                symbol.print();
                System.out.println();
            }
        }
    }

}