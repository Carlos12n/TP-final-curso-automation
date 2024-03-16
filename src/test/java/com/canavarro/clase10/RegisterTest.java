package com.canavarro.clase10;

import com.canavarro.clase8.BaseTest;
import com.canavarro.pages.AccountPage;
import com.canavarro.pages.HomePage;
import com.canavarro.pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void crearCuenta(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        Faker faker = new Faker();//crea cuentas aleatoriamente

        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        homePage.clickMyAccount();
        homePage.clickRegisterDrpdown();

        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );
        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }
}
