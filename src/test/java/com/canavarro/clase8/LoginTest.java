package com.canavarro.clase8;

import com.canavarro.pages.HomePage;
import com.canavarro.pages.LoginPage;
import com.canavarro.pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //PASO 2: click en MyAccount
        homePage.clickMyAccount();

        //PASO 3: CLICk en Login del dropdown
        homePage.clickLoginDropdown();

        //PASO 4: hacer login (ingresar user, pass y click en boton login)
      //  loginPage.setEmail("navarro754@gmail.com");
      //  loginPage.setPassword("7libertadores");
      //  loginPage.clickLogin();

        loginPage.login("navarro754@gmail.com","7libertadores");

        //PASO 5: validaciones
        Assert.assertTrue(myAccountPage.titleIsDisplayed());

    }

    @Test
    public void loginInvalido(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //PASO 2: click en MyAccount
        homePage.clickMyAccount();

        //PASO 3: CLICk en Login del dropdown
        homePage.clickLoginDropdown();

        //PASO 4: hacer login (ingresar user, pass y click en boton login)
        loginPage.login("navarro75444@gmail.com","7libertadores");

        //PASO 5 validaciones
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());
    }

}
