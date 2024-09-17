
import java.text.CharacterIterator;

public class MathOperator extends AFD{
    @Override
    public Token evaluate(CharacterIterator code){
        switch(code.current()){
            case '+' :
                code.next();
                return new Token("PLUS", "+");

            case '-' :
                code.next();
                return new Token("SUB", "-");

            case '*' :
                code.next();
                return new Token("MUL", "*");

            case '/' :
                code.next();
                return new Token("DIV", "/");

            case '=' :
                code.next();
                return new Token("EQUAL", "=");

            case '(' :
                code.next();
                return new Token("AP", "(");

            case ')' :
                code.next();
                return new Token("FP", ")");

            default:
                return null;
        }
    }
    
}