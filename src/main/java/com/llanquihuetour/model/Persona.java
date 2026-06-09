package com.llanquihuetour.model;

/**
 * Clase base que representa a cualquier persona dentro del sistema.
 * Las demás clases que necesiten datos personales deben extender de esta.
 */
public class Persona {
    // Nombre de pila de la persona
    private String nombre;

    // Apellido de la persona
    private String apellido;

    // Edad en años
    private int edad;

    // Género de la persona
    private String genero;

    public Persona() { }

    /**
     * Constructor para crear una persona con todos sus datos básicos.
     * @param nombre   nombre de pila
     * @param apellido apellido
     * @param edad     edad en años
     * @param genero   género de la persona
     */
    public Persona(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
