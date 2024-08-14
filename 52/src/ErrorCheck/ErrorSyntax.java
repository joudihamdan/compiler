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
    public static final ErrorSyntax INSTANCE = new ErrorSyntax();

    public static void writeErrorsOnFile() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("52/src/ErrorFilesOutput/syntaxError"));
            for (int i = 0; i < StoreError.errorList.size(); i++) {
                try {

                    writer.write(StoreError.errorList.get(i));

                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                }
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.err.println("you have some syntax error please go to ( src/ErrorFilesOutput/syntaxError ) ");
    }

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
