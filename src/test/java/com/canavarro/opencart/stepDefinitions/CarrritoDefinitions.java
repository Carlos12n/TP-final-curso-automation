package com.canavarro.opencart.stepDefinitions;

import com.canavarro.opencart.hooks.Hooks;
import com.canavarro.opencart.opencart.pages.CarritoPage;
import com.canavarro.opencart.opencart.pages.FavoritosPage;
import com.canavarro.opencart.opencart.pages.HomePage;
import com.canavarro.opencart.opencart.pages.RegisterPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarrritoDefinitions {
    private HomePage homePage;
    private FavoritosPage favoritosPage;
    private CarritoPage carritoPage;

    public CarrritoDefinitions(){
        this.carritoPage = new CarritoPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.favoritosPage = new FavoritosPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        favoritosPage.ingresarASeccionCamara();
        carritoPage.agregarUnProductoAlCarrito();
        carritoPage.ingresarACarrito();
    }

    @Entonces("se valida que se agrego un producto al carrito")
    public void seValidaQueSeAgregoUnProductoAlCarrito() {
        Assert.assertTrue(carritoPage.cameraInCartIsDisplayed());
    }
}
