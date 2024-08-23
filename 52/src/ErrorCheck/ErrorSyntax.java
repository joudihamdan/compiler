package ErrorCheck;

import Grammar.ReactParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ErrorSyntax extends BaseErrorListener {
    //  public  static  boolean hasError=false;
    public static final ErrorSyntax INSTANCE = new ErrorSyntax();



    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        // hasError=true;
        List<String> stack= ((ReactParser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax Error !");
        String error ="Token"+" \" "+ ((Token)offendingSymbol).getText()+ "\" "
                + "line " + line + ":" + (charPositionInLine +1)
                + " " + msg + "\n";
        System.err.println(error);
        StoreError.errorList.add(error);
        //  System.err.println("Rule Stack:" + stack);
    }
}
