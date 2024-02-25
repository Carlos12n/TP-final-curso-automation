package com.canavarro.clase7;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoldadoTest {
    private Soldado sol;
    @BeforeMethod
    public void setup(){
        sol  = new Soldado(100);
    }
    @Test
    public void saludDespuesDePelear(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(10);
        Assert.assertEquals(soldado.getSalud(), 45, "La salud no es correcta despues de pelear");

    }
    @Test
    public void soldadoMuerto(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(120);

        Assert.assertTrue(soldado.estaMuerto(), "El soldado no esta muerto");
    }
    @Test
    public void elSoldadoDescansa(){
        Soldado soldado = new Soldado(15);
        soldado.descansar();
        Assert.assertEquals(soldado.getSalud(),25);
    }
    @Test
    public void soldadoNoEstaMuerto(){
        sol.pelear(50);
        //Assert.assertEquals(sol.getSalud(),75);
        Assert.assertFalse(sol.estaMuerto());
    }
}
