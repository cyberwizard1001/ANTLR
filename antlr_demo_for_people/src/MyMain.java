
import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;

public class MyMain {

    public static void main(String[] args) {
        try
        {
            CharStream input = (CharStream) new ANTLRFileStream("C:\\Users\\nirma\\IdeaProjects\\antlr_demo_for_people\\src\\input");
            /* give your filepath in the above place*/
            Lexar lexer = new Lexar((org.antlr.v4.runtime.CharStream) input);
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