package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.RealizarCompra;
import tasks.SeleccionarProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CompraProductoStepDefinition {

    @Before
    public void SetUp() {


        setTheStage(new OnlineCast());


        }
        @Given("that {string} wants visit the falabella page")
        public void thatWantsVisitTheFalabellaPage(String actorName, String url) {
        theActorCalled(actorName).attemptsTo(Open.url(url));



        }
        @When("he search the article {string} on falabella page")
        public void heSearchTheArticleOnFalabellaPage(String producto) {
            theActorInTheSpotlight().attemptsTo(SeleccionarProducto.con(producto));

        }
        @When("he fill the form")
        public void heFillTheForm(io.cucumber.datatable.DataTable informacionDespacho) {
            theActorInTheSpotlight().attemptsTo(RealizarCompra.conInfo(informacionDespacho));
        }
        @Then("he find the tittle called {string}")
        public void heFindTheTittleCalled(String texto) {
             theActorInTheSpotlight().should(seeThat(ValidarTexto.con(texto, TITULO),equalTO(texto)));

        }
}
