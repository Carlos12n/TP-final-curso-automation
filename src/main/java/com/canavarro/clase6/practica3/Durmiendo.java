package com.canavarro.clase6.practica3;

public class Durmiendo {
    public void dormir(long segundos){
        try {
            System.out.println("Yendo a dormir");
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e){
            System.out.println("No se pudo dormir el proceso");
        }
        System.out.println("El proceso se levantò");
    }
}
