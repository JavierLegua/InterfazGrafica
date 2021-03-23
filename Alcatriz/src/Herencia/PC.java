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
public class PC extends Equipo{
    
    private String tipo;
    private String SO;

    public PC(String tipo, String SO, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.tipo = tipo;
        this.SO = SO;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "PC{" + "tipo=" + tipo + ", SO=" + SO + '}';
    }
    
    
    
}
