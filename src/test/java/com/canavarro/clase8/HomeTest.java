package com.canavarro.clase8;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void validarHome(){
        // PASO 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //PASO 2: realizar las aserciones
        By inputBy = By.name("search");
        By carrouselBy = By.id("content");
        By menuBy = By.id("menu");
        By myAccountBy = By.xpath("//a[@title=\"My Account\"]");

        //ahora a buscar los elementos
        WebElement inpuntEl = getDriver().findElement(inputBy); //si no lo encuentra se rompe el test y finaliza
        WebElement carrouselEl = getDriver().findElement(carrouselBy);
        WebElement menuByEl = getDriver().findElement(menuBy);
        WebElement myAccountEl = getDriver().findElement(myAccountBy);

        Assert.assertTrue(inpuntEl.isDisplayed(), "No se visualizò el input"); //si llega a fallar mando mje
        Assert.assertTrue(carrouselEl.isDisplayed());
        Assert.assertTrue(menuByEl.isDisplayed());
        Assert.assertTrue(myAccountEl.isDisplayed());


    }
}
