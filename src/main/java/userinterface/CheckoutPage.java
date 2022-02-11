package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {
    public static final Target INPUT_DEPARTAMENTO = Target.the("campo para seleccionar el departamento")
            .locatedBy("//select[@id ='departamento']//option[@class='fbra_selectOption' and contains(text(),'{0}')]");

    public static final Target INPUT_CIUDAD = Target.the("campo para seleccionar la ciudad")
            .locatedBy("//select[@id ='ciudad']//option[@class='fbra_selectOption' and contains(text(),'{0}')]");

    public static final Target INPUT_DIRECCION = Target.the("campo para llenar la direccion")
            .locatedBy("//select[@id ='comuna']//name[@class='fbra_select fbra_formItem__comuna' and contains(text(),'{0}')]");


}
