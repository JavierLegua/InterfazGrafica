/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author daw-A
 */
public class Equipo {

    protected String codigo;
    protected String ubicacion;
    protected double precio;
    protected boolean protegido; //True protegido, false no protegido.

    public Equipo(String codigo, String ubicacion, double precio, boolean protegido) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.protegido = protegido;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the protegido
     */
    public boolean isProtegido() {
        return protegido;
    }

    /**
     * @param protegido the protegido to set
     */
    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", ubicacion=" + ubicacion + ", precio=" + precio + ", protegido=" + protegido + '}';
    }

}
