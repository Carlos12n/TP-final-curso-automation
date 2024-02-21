package com.canavarro.clase6.practica3;

public class MainExcepciones {
    public static void main(String[] args) {
        Durmiendo durmiendo = new Durmiendo();
        durmiendo.dormir(2);
        try{
            durmiendo.dormir(-5);
        }catch (IllegalArgumentException e){
            System.out.println("sad");
        }

    }
}
