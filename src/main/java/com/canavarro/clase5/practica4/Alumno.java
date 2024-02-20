package com.canavarro.clase5.practica4;

import java.util.List;

public class Alumno extends Persona{
    private String matricula;
    private Integer nota;
    private List<String> materias;

    public Alumno(String nombre, String apellido, String matricula, Integer nota, List<String> materias) {
        super(nombre, apellido);//le pasa los parametros al padre que tiene solo 2 parametros

        //instancio los atributos propios de la clase Alumno
        this.matricula = matricula;
        this.nota = nota;
        this.materias = materias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(String materia) {
        this.materias.add(materia);
    }

    @Override
    public void saludar(){
        System.out.println("Que hondaa");
    }
}
