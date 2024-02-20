package com.canavarro.clase5.practica4;

import java.util.List;

public class Profesor extends Persona{
    private List<Alumno> alumnos;

    //Alt+Inser y creamos el constructor
    public Profesor(String nombre, String apellido, List<Alumno> alumnos) {
        super(nombre, apellido);
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    @Override
    public void saludar(){
        System.out.println("holaa a todosss");
    }
    /*
    en profesor debe implementar un metodo calificar() sobrecargando
    si calificar recibe un Alumno y la nota, agrega a ese alumno la nota
    si calificar solo recibe una nota, agrega a todos sus alumnos la misma nota
     */
    public void calificar(Alumno alumno, Integer nota){
        alumno.setNota(nota);
    }
    public void calificar(Integer nota){

       // for (int i = 0; i < alumnos.size(); i++){
       //     Alumno a = alumnos.get(i);
       //     a.setNota(nota);
       // }

        //algo equivalente con for-each
        for (Alumno a : alumnos){
            a.setNota(nota);
        }
    }
}

