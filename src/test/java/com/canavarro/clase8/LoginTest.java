package com.canavarro.clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //PASO 2: click en MyAccount
        By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
        WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

        //PASO 3: CLICk en Login del dropdown
        By loginBy = By.xpath("//a[text()=\"Login\"]");
        WebElement loginEl = getDriver().findElement(loginBy);
        loginEl.click();

        //PASO 4: hacer login (ingresar user, pass y click en boton login)
        By inputEmailBy = By.id("input-email");
        By inputPassBy = By.id("input-password");
        By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");

        WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
        WebElement inputPassEl = getDriver().findElement(inputPassBy);
        WebElement buttonLoginEl = getDriver().findElement(buttonLoginBy);

        inputEmailEl.sendKeys("navarro754@gmail.com");
        inputPassEl.sendKeys("7libertadores");
        buttonLoginEl.click();

        //PASO 5: validaciones
        By titleBy = By.xpath("//h2[text()=\"My Account\"]");
        WebElement titleEl = getDriver().findElement(titleBy);

        Assert.assertTrue(titleEl.isDisplayed());

    }

}
