import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class Main {

    public static void main(String[] args) {

        try
        {
            CharStream input = new ANTLRFileStream("C:\\Users\\nirma\\IdeaProjects\\antlr_1\\src\\input");
            /* give your filepath in the above place*/
            scanner lexer = new scanner((org.antlr.v4.runtime.CharStream) input);
            Token token;
            while ((token = (Token) lexer.nextToken()).getType()!=-1) {
                System.err.println(token.getText());

            }
        }
        catch(Exception e){

            System.out.println(e);
        }

    }
}


