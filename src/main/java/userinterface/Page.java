package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")

public class Page extends PageObject {
    public static final Target CAMPO_BUSQUEDA = Target.the("campo para ingresar el producto a buscar")
            .locatedBy("//input[@class= 'SearchBar-module_searchBar__Input__1VvhT']");

    public static final Target BOTON_BUSCAR = Target.the("boton para buscar")
            .locatedBy("//button[@class= 'SearchBar-module_searchBtnIcon__6KVum']");

    public static final Target AGREGAR_A_LA_BOLSA = Target.the("boton para agregar a la bolsa")
            .locatedBy("//button[@class= 'jsx-2166277967 button button-primary button-primary-medium-large']");

    public static final Target VER_BOLSA_DE_COMPRAS = Target.the("boton para ver bolsa")
            .located(By.id("linkButton"));


    public static final Target IR_A_COMPRAR = Target.the("boton para ir a comprar")
            .locatedBy("//button[@class= 'fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");




}
