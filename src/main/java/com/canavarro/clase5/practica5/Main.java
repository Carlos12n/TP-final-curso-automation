package com.canavarro.clase5.practica5;

import com.canavarro.clase5.practica4.Alumno;
import com.canavarro.clase5.practica4.Persona;
import com.canavarro.clase5.practica4.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    en una clase que contenga un main. Instanciar las clases hijas y una lista de Personas
    Agregar a la lista los objetos instanciados y mediante un bucle acceder a cada elemento de la lista
    y usar el metodo saludar().
     */
    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();
        materias.add("Fisica");

        //instancio Alumno
        Alumno alumno = new Alumno("pepe", "pepito", "abc", 6, materias);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);

        //instancio Profesor
        Profesor profesor = new Profesor("Jose", "Perez", alumnos);

        //instancio NoDocente
        NoDocente noDocente = new NoDocente("No","Docente");

        //creo una lista de personas
        List<Persona> personas = new ArrayList<>();

        personas.add(alumno);
        personas.add(profesor);
        personas.add(noDocente);

        //hago el bucle para saludar() aplicando polimosfismo, xq persona puede ser alumno, noDocente o profesor
        for (Persona p : personas){
            p.saludar();
        }

        profesor.calificar(10);
        profesor.calificar(alumno, 2);
    }
}
