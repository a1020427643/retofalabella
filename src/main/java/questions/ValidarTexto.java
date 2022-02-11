package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTexto implements Question<String> {

    private String text;

    public ValidarTexto(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    private Target target;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target.of(text)).viewedBy(actor.asString());
    }

    public static ValidarTexto con(String text, Target target){

        return new ValidarTexto(text,target);
    }
}
