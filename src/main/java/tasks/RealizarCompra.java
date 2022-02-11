package tasks;

import io.cucumber.datatable.DataTable;
import model.Despacho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.CheckoutPage;

import java.util.Map;

import static userinterface.CheckoutPage.*;

public class RealizarCompra implements Task {

    private DataTable data;
    private Map< String, String> info;
    private Despacho despacho;

    public RealizarCompra(DataTable data) {
        this.data = data;
        info = this.data.asMap(String.class);
        despacho = new Despacho(info.get("departamento"),info.get("ciudad"),info.get("barrio"),info.get("direccion"),info.get("detalle"));

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_DEPARTAMENTO.of(despacho.getDepartamento())),
                Click.on(INPUT_CIUDAD.of(despacho.getCiudad())),
                Click.on(INPUT_DIRECCION.of(despacho.getBarrio()))

        );
    }
    public static RealizarCompra conInfo(DataTable data){
        return Task.instrumented(RealizarCompra.class, data);

    }
}
