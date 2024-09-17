import java.text.CharacterIterator;

public class Delimiter extends AFD {
    @Override
    public Token evaluate(CharacterIterator code){
        switch(code.current()){
            case ';' :
                code.next();
                return new Token("ENDL", ";");

            default:
                return null;
        }
    }
}
