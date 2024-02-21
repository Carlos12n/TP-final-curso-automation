package com.canavarro.clase6.practica4;

public class Dvd {
    public void reproducir(){
        System.out.println("Reproduciendo contenido");
        throw new ReproducirException();

    }
    public void detener() throws StopException {
        System.out.println("deteniendo contenido");
        throw new StopException();
    }
}
