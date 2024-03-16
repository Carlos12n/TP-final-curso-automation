package com.canavarro.stepDefinitions;

import com.canavarro.hooks.Hooks;
import com.canavarro.pages.HomePage;
import com.canavarro.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

public class LoginDefinitions {
    private HomePage homePage;
    private LoginPage loginPage;
    public LoginDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
    }
    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get("https://opencart.abstracta.us/");

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales válidas")
    public void elUsuarioSeLogueaConCredencialesVálidas() {
        loginPage.login("navarro754@gmail.com","7libertadores");
    }
}
