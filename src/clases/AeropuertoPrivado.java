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
public class AeropuertoPrivado extends Aeropuerto{
    private String listaEmpresas[] = new String[3];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] listaCompañias, String ListaEmpresas[]) {
        super(nombre, ciudad, pais, listaCompañias);
        this.listaEmpresas = ListaEmpresas;
        numEmpresa = ListaEmpresas.length;
    }
    
    public void InsertarEmpresa(String empresa){
        listaEmpresas[numEmpresa] = empresa;
        numEmpresa++;
    }
    
    public void InsertarEmpresas(String empresas[]){
       this.listaEmpresas= empresas;
       this.numEmpresa = empresas.length;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }
    
    
    
    
    
    
}
