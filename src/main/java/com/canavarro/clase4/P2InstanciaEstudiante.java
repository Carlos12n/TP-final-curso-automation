package com.canavarro.clase4;

public class P2InstanciaEstudiante {
    public static void main(String[] args) {
        P1Estudiante pepe = new P1Estudiante(5,"Pepito","Pepe",10.0f);

        System.out.println("Id: "+pepe.getId());
        System.out.println("Nombre: "+pepe.getNombre());
        System.out.println("Apellido: "+pepe.getApellido());
        System.out.println("Promedio: "+pepe.getPromedio());

        System.out.println();
        //uso de setters
        pepe.setPromedio(8.0f);
        System.out.println("Promedio: "+pepe.getPromedio());

        pepe.setNombre("Pepa");
        System.out.println("Nombre: "+pepe.getNombre());

        System.out.println();

        P1Estudiante nn = new P1Estudiante();

        System.out.println("Id: "+nn.getId());
        System.out.println("Nombre: "+nn.getNombre());
        System.out.println("Apellido: "+nn.getApellido());
        System.out.println("Promedio: "+nn.getPromedio());

    }
}
