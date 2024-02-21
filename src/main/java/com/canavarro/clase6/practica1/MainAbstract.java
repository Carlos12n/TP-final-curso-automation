package com.canavarro.clase6.practica1;

import java.util.ArrayList;
import java.util.List;

public class MainAbstract {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 10);
        Rectangulo rectangulo = new Rectangulo("verde", 5, 8);
        Triangulo triangulo = new Triangulo("amarillo", 2, 15);

        List<Figura> listaDeFiguras = new ArrayList<>();
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(rectangulo);
        listaDeFiguras.add(triangulo);

        //for each aplicando funciones lambda
     //   listaDeFiguras.forEach(figura -> figura.calcularArea());

        //equivale a
        for(Figura figura : listaDeFiguras){
            System.out.println("Area: "+figura.calcularArea());
        }
    }
}
