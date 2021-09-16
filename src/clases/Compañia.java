/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Daniel Ramirez 
 */
public class Compañia {
    private String nombre;
    private int numVuelo = 0;
    private Vuelo listaVuelos[] =  new Vuelo[10];
  
    public Compañia(String nombre) {
        this.nombre = nombre;
    }
    
    public Compañia(String nombre,Vuelo listaVuelos[]){
        this.nombre = nombre;
        this.listaVuelos = listaVuelos;
        numVuelo = listaVuelos.length;
    }

    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }
    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i = 0;
       Vuelo vuelito = null;
        while(!encontrado && i < listaVuelos.length){
            if(listaVuelos[i].getIdentificador().equals(id)){
                encontrado = true;
                vuelito =  listaVuelos[i];
            }
            i++;
        }
        return vuelito;
    }
    
    
    
    
    
    
    
}
