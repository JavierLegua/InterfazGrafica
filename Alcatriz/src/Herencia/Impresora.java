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
public class Impresora extends Equipo{
    
    private String TipoTinta;

    public Impresora(String TipoTinta, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.TipoTinta = TipoTinta;
    }

    /**
     * @return the TipoTinta
     */
    public String getTipoTinta() {
        return TipoTinta;
    }

    /**
     * @param TipoTinta the TipoTinta to set
     */
    public void setTipoTinta(String TipoTinta) {
        this.TipoTinta = TipoTinta;
    }

    @Override
    public String toString() {
        return "Impresora{" + "TipoTinta=" + TipoTinta + '}';
    }
    
   
    
}
