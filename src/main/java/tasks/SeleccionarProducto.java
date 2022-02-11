package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.Page;

import static userinterface.Page.*;

public class SeleccionarProducto implements Task {

    private String producto;

    public SeleccionarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(Page.CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSCAR),
                Click.on(AGREGAR_A_LA_BOLSA),
                Click.on(VER_BOLSA_DE_COMPRAS),
                Click.on(IR_A_COMPRAR)


        );
    }

    public static SeleccionarProducto con(String producto){
        return Tasks.instrumented(SeleccionarProducto.class, producto);
    }

}
