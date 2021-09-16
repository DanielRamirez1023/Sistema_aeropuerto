/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author x542u
 */
public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }
    
    public AeropuertoPublico(String nombre, String ciudad, String pais,double subvencion) {
        super(nombre, ciudad, pais);
         this.subvencion = subvencion;
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] listaCompañias,double subvencion) {
        super(nombre, ciudad, pais, listaCompañias);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
    
    
    
    
}
