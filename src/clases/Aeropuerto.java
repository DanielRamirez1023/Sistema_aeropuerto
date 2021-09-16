/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author daniel Ramirez 
 */
public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private int numCompañia;
    private Compañia listaCompañias[] = new Compañia[6];

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] listaCompañias) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompañias = listaCompañias;
        this.numCompañia = listaCompañias.length;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getNumCompañia() {
        return numCompañia;
    }
    
    public void InsertarCompañia(Compañia compañia){
        listaCompañias[numCompañia] = compañia;
        numCompañia++;
    }
    
    public Compañia getCompañia(int i){
       return  listaCompañias[i];
    }
    
    public Compañia getCompañia(String nombre){
       boolean encontrado = false;
       Compañia A = null;
       int i=0;
       while(!encontrado && i < listaCompañias.length){
           if(listaCompañias[i].getNombre().equals(nombre)){
               A = listaCompañias[i];
               encontrado = true;
           }
           i++;
       }
       return A;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + nombre + "\nCiudad: " + ciudad + "\nPais: " + pais + "\n";
    }
    
    
    
}
