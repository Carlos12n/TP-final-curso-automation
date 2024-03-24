package com.canavarro.opencart.stepDefinitions;

import com.canavarro.opencart.hooks.Hooks;
import com.canavarro.opencart.opencart.pages.FavoritosPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class FavoritosDefinitions {
    private FavoritosPage favoritosPage;
    public FavoritosDefinitions(){
        this.favoritosPage = new FavoritosPage(Hooks.getDriver());
    }
    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {
        favoritosPage.ingresarASeccionCamara();
        favoritosPage.agregarUnProductoAFav();
        favoritosPage.ingresarAFavoritos();

    }

    @Entonces("se valida que se agrego a favoritos")
    public void seValidaQueSeAgregoAFavoritos() {
        Assert.assertTrue(favoritosPage.cameraInFavDisplayed());
    }
}
