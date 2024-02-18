package com.canavarro.clase3;

public class P5Bucles {
    public static void main(String[] args) {
        //while
        int contador = 0;

        while (contador < 5) {
            System.out.println("Hola Mundo");

            contador = contador + 1;
        }
        System.out.println();
        //do-while
        int contadorDoWhile = 0;
        do {
            System.out.println("Hola Mundo");
            contadorDoWhile++; //equivale a contador = contador + 1
        } while (contadorDoWhile < 5);

        System.out.println();
        //for
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo");
        }
    }
}
