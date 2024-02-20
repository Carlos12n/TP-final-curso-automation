package com.canavarro.clase5.practica4;

/*
Crear una clase (padre) Persona y las clases Alumno y Profesor que hereden de Persona.
Persona debe tener los atributos nombre y apellido (ambos strings).
Alumno debe tener los atributos matrícula (string), nota (integer) y lista de materias (lista de
string)
Profesor debe tener el atributo lista de alumnos (lista de Alumno)
Todas las clases deben contar con sus constructores correspondientes y métodos getters & setters
 */
public class Persona {
    protected String nombre;
    private String apellido;

    //con Alt+Insert genero el constructor, selecciono nombre y apellido en este caso
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //geters y seter tambien con Alt+Insert, luego geters and seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected void saltar(){
        System.out.println("Estoy santando ");
    }
    public void saludar(){
        System.out.println("Hola, como estan?");
    }


}
