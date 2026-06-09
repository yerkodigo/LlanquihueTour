package com.llanquihuetour.model;

import java.time.LocalDate;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Extiende de Persona agregando los datos propios del cargo.
 */
public class Empleado extends Persona {
    // Identificador único del empleado dentro de la agencia
    private int numeroEmpleado;

    // Fecha en que el empleado ingresó a trabajar - Investigué un poco y encontré LocalDate en versiones
    // de java más modernas para usar fechas, ya que anteriormente solo había trabajado con Date.
    private LocalDate fechaIngreso;

    // Indica si el empleado sigue activo (true) o fue dado de baja (false)
    private Boolean vigente;

    // Dirección de residencia del empleado
    private Direccion direccion;

    public Empleado() {
        super();
    }

    /**
     * Constructor parcial, para cuando los datos personales se asignan por separado con setters.
     * @param numeroEmpleado identificador del empleado
     * @param fechaIngreso   fecha de ingreso a la empresa.
     * @param vigente        si está activo o no
     * @param direccion      dirección de residencia
     */
    public Empleado(int numeroEmpleado, LocalDate fechaIngreso, Boolean vigente, Direccion direccion) {
        this.numeroEmpleado = numeroEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.vigente = vigente;
        this.direccion = direccion;
    }

    /**
     * Constructor completo para crear un empleado con todos sus datos de una vez.
     * @param nombre         nombre de pila
     * @param apellido       apellido
     * @param edad           edad en años
     * @param genero         género
     * @param numeroEmpleado número identificador del empleado
     * @param fechaIngreso   fecha en que comenzó a trabajar
     * @param vigente        si está activo o no
     * @param direccion      dirección de residencia
     */
    public Empleado(String nombre, String apellido, int edad, String genero, int numeroEmpleado, LocalDate fechaIngreso, Boolean vigente, Direccion direccion) {
        super(nombre, apellido, edad, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.vigente = vigente;
        this.direccion = direccion;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
//        return "Empleado{" +
//                "numeroEmpleado=" + numeroEmpleado +
//                ", fechaIngreso=" + fechaIngreso +
//                ", vigente=" + vigente +
//                ", direccion=" + direccion.toString() +
//                '}';

        return "\n" +
                "\n**************************************************************" +
                "\nREGISTRO EMPLEADO" +
                "\nN° Empleado : " + numeroEmpleado +
                "\nNombre      : " + getNombre() + " " + getApellido() +
                "\nEdad        : " + getEdad() +
                "\nGénero      : " + getGenero() +
                "\nVigente     : " + (vigente ? "Activo" : "Inactivo") +
                "\nIngreso     : " + fechaIngreso +
                "\n" +
                "\nDIRECCIÓN" +
                "\nCalle       : " + direccion.getCalle() + " " + direccion.getNumero() +
                "\nCiudad      : " + direccion.getCiudad() +
                "\nRegión      : " + direccion.getRegion() +
                (!direccion.getReferencia().isEmpty()
                        ? "\nReferencia  : " + direccion.getReferencia()
                        : "") +
                "\n**************************************************************" +
                "\n";
    }

}
