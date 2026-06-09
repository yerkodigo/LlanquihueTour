package com.llanquihuetour.model;

import java.time.LocalDate;

public class Empleado extends Persona {
    private int numeroEmpleado;
    private LocalDate fechaIngreso;
    private Boolean vigente;
    private Direccion direccion;

    public Empleado() {
        super();
    }



    public Empleado(int numeroEmpleado, LocalDate fechaIngreso, Boolean vigente, Direccion direccion) {
        this.numeroEmpleado = numeroEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.vigente = vigente;
        this.direccion = direccion;
    }

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
