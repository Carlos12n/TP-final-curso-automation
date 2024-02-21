package com.canavarro.clase6.practica2;

import com.canavarro.clase6.practica1.Cuadrado;
import com.canavarro.clase6.practica1.Rectangulo;
import com.canavarro.clase6.practica1.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 10);
        Rectangulo rectangulo = new Rectangulo("verde", 5, 8);
        Triangulo triangulo = new Triangulo("amarillo", 2, 15);

        List<Dibujable> listaDeDibujables = new ArrayList<>();
        listaDeDibujables.add(cuadrado);
        listaDeDibujables.add(triangulo);
        //listaDeDibujables.add(rectangulo); un rectangulo no es dibujable

        //usando polimorfismo
        for (Dibujable dibujable : listaDeDibujables){
            dibujable.dibujar();
            dibujable.borrar();
        }
    }

}
// quede en 1 hora 30 minutos en clase 6