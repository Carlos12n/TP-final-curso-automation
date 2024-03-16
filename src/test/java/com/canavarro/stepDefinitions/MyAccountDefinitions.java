package com.canavarro.stepDefinitions;

import com.canavarro.hooks.Hooks;
import com.canavarro.pages.MyAccountPage;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class MyAccountDefinitions {
    private MyAccountPage myAccountPage;
    public MyAccountDefinitions(){
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Entonces("el usuario se encuentra en su cuenta")
    public void elUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }
}
