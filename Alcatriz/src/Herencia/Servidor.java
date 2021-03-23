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
public class Servidor extends Equipo{
    
    private String SO;
    private String añoCompra;

    public Servidor(String SO, String añoCompra, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.SO = SO;
        this.añoCompra = añoCompra;
    }

    /**
     * @return the SO
     */
    public String getSO() {
        return SO;
    }

    /**
     * @param SO the SO to set
     */
    public void setSO(String SO) {
        this.SO = SO;
    }

    /**
     * @return the añoCompra
     */
    public String getAñoCompra() {
        return añoCompra;
    }

    /**
     * @param añoCompra the añoCompra to set
     */
    public void setAñoCompra(String añoCompra) {
        this.añoCompra = añoCompra;
    }

    @Override
    public String toString() {
        return "Servidor{" + "SO=" + SO + ", a\u00f1oCompra=" + añoCompra + '}';
    }
    
    
    
}
