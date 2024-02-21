package com.canavarro.clase6.practica2;

public interface Dibujable {
    void dibujar();

    default void borrar(){
        System.out.println("borrando figura");
    }
}
