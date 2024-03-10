package com.canavarro.clase8;

import com.canavarro.pages.HomePage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void validarHome(){
        HomePage homePage = new HomePage(getDriver());

        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //PASO 2: realizar las aserciones
                
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());

    }
}
