package tasks;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private static Page page;

    public static OpenUp page(){ return Task.instrumented(OpenUp.class);}


    @Override
    public <T extends Actor> void performAs (T Actor){
        actor.attemptsTo(
                Open.browserOn((PageObject).page)

        );


    }

    private static class Page {
    }
}
