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
public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros,int numActualPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActPasajeros = 0;
         this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }

    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActPasajeros] = pasajero;
        numActPasajeros++;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActPasajeros() {
        return numActPasajeros;
    }
    
    public Pasajero getPasajero(int i){  
        return listaPasajeros[i];
    }
    
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
       Pasajero pas = null;
        while(!encontrado && i < listaPasajeros.length){
            if(listaPasajeros[i].getPasaporte().equals(pasaporte)){
                encontrado = true;
                pas =  listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
    
    public String MostrarVuelo(){
        return "Ciudad de origen: "+this.ciudadOrigen+" ->>  Ciudad de destino: "+this.ciudadDestino+" Precio: "+this.precio;
    }
    
    
    
}
