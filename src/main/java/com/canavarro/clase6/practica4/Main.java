package com.canavarro.clase6.practica4;

public class Main {
    public static void main(String[] args) throws StopException {
        Dvd dvd = new Dvd();
        Persona persona = new Persona(dvd);
        persona.mirarPelicula();
        persona.IrADormir();
    }
}
