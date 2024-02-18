package com.canavarro.clase3;

public class P3Operadores {
    public static void main(String[] args) {

        //operadores aritmeticos
        int suma = 10 + 10;
        int division = 10 / 5;

        System.out.println("Suma: "+suma);
        System.out.println("División: "+division);

        //operadores relacionales
        boolean menor = 20 < 10;
        boolean distinto = 5 != 10;
        boolean igualdad = 20 ==20;

        System.out.println("Menor: "+menor);
        System.out.println("Distinto: "+distinto);
        System.out.println("Igualdad: "+igualdad);

        //operadores condicionales
        boolean and = (10 < 10) && (20 != 5);

        boolean or = (5 == 1) || (100 < 100);

        System.out.println("And: "+and);
        System.out.println("Or: "+or);
    }
}
