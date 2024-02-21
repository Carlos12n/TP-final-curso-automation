package com.canavarro.clase6.practica4;

public class ReproducirException extends RuntimeException{
    public ReproducirException(){
        super("No se pudo imprimir en el dispositivo");
    }
}
