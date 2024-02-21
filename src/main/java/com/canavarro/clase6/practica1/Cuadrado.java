package com.canavarro.clase6.practica1;

import com.canavarro.clase6.practica2.Dibujable;

public class Cuadrado extends Figura implements Dibujable {
    private Integer lado;

    public Cuadrado(String color, Integer lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public Integer calcularArea(){
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado ...");
    }
}
