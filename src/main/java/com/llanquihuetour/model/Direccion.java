package com.llanquihuetour.model;
/**
 * Dirección que tiene todos los atributos de la misma
 */
public class Direccion {
    //    Nombre de la calle donde vive
    private String calle;

    //    Número de la calle donde vive, en caso de no tener número dejar como null
    private int numero;

    //    Ciudad donde vive
    private String ciudad;

    //    Región donde vive
    private String region;

    //    En caso de añadir alguna referencia, si no, no agregar al constructor e irá por defecto vacío
    private String referencia = "";

    public Direccion() { }

    /**
     * Constructor para crear dirección sin una referencia.
     * La referencia por defecto será en la clase un string vacío
     * @param calle
     * @param numero
     * @param ciudad
     * @param region
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Constructor para crear dirección con referencia explícita
     * @param calle
     * @param numero
     * @param ciudad
     * @param region
     * @param referencia
     */
    public Direccion(String calle, int numero, String ciudad, String region, String referencia) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
        this.referencia = referencia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                (!"".equals(referencia) ? (", referencia='" + referencia + '\'') : "") +
                '}';
    }
}
