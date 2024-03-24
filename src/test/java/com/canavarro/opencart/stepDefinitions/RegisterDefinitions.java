package com.canavarro.opencart.stepDefinitions;

import com.canavarro.opencart.hooks.Hooks;
import com.canavarro.opencart.opencart.pages.AccountPage;
import com.canavarro.opencart.opencart.pages.HomePage;
import com.canavarro.opencart.opencart.pages.MyAccountPage;
import com.canavarro.opencart.opencart.pages.RegisterPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class RegisterDefinitions {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private MyAccountPage myAccountPage;
    public RegisterDefinitions(){
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de registro")
    public void queElUsuarioIngresaALaPáginaDeRegistro() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();
    }

    @Cuando("el usuario se registra con datos válidas")
    public void elUsuarioSeRegistraConDatosVálidas() {
        registerPage.completarFormulario("Lucas","Rodrigues","lucasR1588_90@gmail.com","555879","1234");
    }

    @Entonces("el usuario se encuentra registrado")
    public void elUsuarioSeEncuentraRegistrado() {
        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }

    @Cuando("el usuario se registra con datos inválidas")
    public void elUsuarioSeRegistraConDatosInválidas() {
        registerPage.completarFormulario("Lucas","Rodrigues","","555879","1234");
    }

    @Entonces("se muestra un mensaje de error de registro")
    public void seMuestraUnMensajeDeErrorDeRegistro() {
        Assert.assertTrue(registerPage.inputVacioIsDisplayed());
    }
}
