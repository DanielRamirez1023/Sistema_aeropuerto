/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.AeropuertoPublico;
import clases.Compañia;
import clases.Pasajero;
import clases.Vuelo;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel Ramirez 
 */
public class Principal {
    
   static  Scanner teclado = new Scanner(System.in);
   static  final int cantidadA = 3;
   static Aeropuerto Aeropuertos[] = new Aeropuerto[cantidadA];

   
   public static void main(String[] args) {
        
        
      /**/  InsertarAeropuerto(Aeropuertos);
        
       Menu();
        
        
    }
    
   public static void InsertarAeropuerto(Aeropuerto ListaAeropuerto[]){
        //Creando Aeropuertos 
        ListaAeropuerto[0] = new AeropuertoPublico("Olaya Herrera", "Medellin", "Colombia",12000000);
        ListaAeropuerto[1] = new AeropuertoPrivado("Jose Maria Cordoba", "Rionegro", "Colombia");
        ListaAeropuerto[2] = new AeropuertoPublico("El dorado", "Bogota", "Colombia", 10000000);
        
        //insertando compañias a cada Aeropuerto (2 compañias por aeropuerto)
         ListaAeropuerto[0].InsertarCompañia(new Compañia("Avianca"));
         ListaAeropuerto[0].InsertarCompañia(new Compañia("Viva colombia"));
         ListaAeropuerto[1].InsertarCompañia(new Compañia("Latam"));
         ListaAeropuerto[1].InsertarCompañia(new Compañia("Satena"));
         ListaAeropuerto[2].InsertarCompañia(new Compañia("Wingo"));
         ListaAeropuerto[2].InsertarCompañia(new Compañia("Iberia"));
         
         //insertando los vuelos de cada compañia (vuelo por compañia)
         ListaAeropuerto[0].getCompañia(0).insertarVuelo(new Vuelo("aire123", "Medellin", "Pereira", 10000, 15,0));
          ListaAeropuerto[0].getCompañia(0).insertarVuelo(new Vuelo("aire456", "Medellin", "Pereira", 20000, 10,0));
         ListaAeropuerto[0].getCompañia(1).insertarVuelo(new Vuelo("aire234", "Medellin", "New York", 5000, 20, 0));
         ListaAeropuerto[1].getCompañia(0).insertarVuelo(new Vuelo("aire567", "Rionegro", "Quibdo", 12000, 8, 0));
         ListaAeropuerto[1].getCompañia(1).insertarVuelo(new Vuelo("aire323", "Medellin", "la paz", 120000, 10, 0));
         ListaAeropuerto[2].getCompañia(0).insertarVuelo(new Vuelo("cuco527", "Bogota", "Cali", 13000, 20, 0));
         ListaAeropuerto[2].getCompañia(1).insertarVuelo(new Vuelo("chis512", "Rionegro", "Rio de Janeiro", 13000, 20, 0));
         
         //insertando pasajeros a los vuelos 
          ListaAeropuerto[0].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("Daniel", "aei232", "Colombiano"));
          ListaAeropuerto[0].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("paulina", "aei332", "Colombiana"));
          ListaAeropuerto[0].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("tulio", "brai232", "Colombiano"));
          ListaAeropuerto[0].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("arjemira", "brei232", "Colombiano"));
          
          ListaAeropuerto[1].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("pitufo", "piti232", "Colombiano"));
          ListaAeropuerto[1].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("leonel", "leoi232", "Colombiano"));
          ListaAeropuerto[1].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("karol", "kar232", "Colombiana"));
          ListaAeropuerto[1].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("tini", "tini232", "Colombiana"));
          
          ListaAeropuerto[2].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("camilo", "cam232", "Colombiano"));
          ListaAeropuerto[2].getCompañia(0).getVuelo(0).insertarPasajero(new Pasajero("melissa", "meli232", "Colombiana"));
          ListaAeropuerto[2].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("emanuel", "emal232", "Colombiano"));
          ListaAeropuerto[2].getCompañia(1).getVuelo(0).insertarPasajero(new Pasajero("sara", "sar232", "Colombiana"));
          
          //poder acceder al hijo de aeropuerto que es aeropuertoprivado (downcasting)
            ((AeropuertoPrivado)ListaAeropuerto[1]).InsertarEmpresa("Adidas");
            ((AeropuertoPrivado)ListaAeropuerto[1]).InsertarEmpresa("Nike");
            ((AeropuertoPrivado)ListaAeropuerto[1]).InsertarEmpresa("Puma");
          
    }
   
   public static void MostrarAeropuertos(Aeropuerto aeropuertos[]){
       //la condicion instanceof sirve para comparar con el tipo de variable, que tipo de instancia tiene. solo funciona con clases 
                   
               
                      for (Aeropuerto a : aeropuertos) {
                           if(a instanceof AeropuertoPrivado){
                          System.out.print("\nAeropuerto Privado");
                          System.out.print(a.toString());
                      }else{
                          System.out.print("\nAeropuerto Publico");
                          System.out.print(a.toString());
                          
                        }
                       }
   }
   
   public static void MostrarEmpresas(Aeropuerto aeropuertos[]){
      String Empresas[];
       
       for(Aeropuerto a : aeropuertos){
           /*el instanceof solo funciona si la clase tiene dos hijos*/
           if(a instanceof AeropuertoPrivado){
               System.out.println("\nAeropuerto privado: "+a.getNombre());
               System.out.println("\nEmpresas:");
              /*selecciona el aeropuerto y lo lleva a su clase de aeropuerto privado para obtener sus empresas se le llama downcasting*/
               Empresas = ((AeropuertoPrivado) a).getListaEmpresas();
               for (int i = 0; i < Empresas.length; i++) {
                   System.out.println(Empresas[i]);
               }
   
           }else{
               System.out.println("\nAeropuerto publico: "+a.getNombre());
                   System.out.println("Subvencion: "+((AeropuertoPublico)a).getSubvencion());
               //error
           }
       }
   }
   
   public static Aeropuerto BuscarAeropuerto(String Nombre,Aeropuerto Aeropuertos[]){
       
       for(Aeropuerto a: Aeropuertos){
           if(a.getNombre().equals(Nombre)){
               return a;
           }
       }
       return null;
   }
   
   public static void MostrarCompañias(Aeropuerto aeropuerto){
        
       System.out.print(aeropuerto.toString());
       System.out.print("\nCompañias: \n");
       for (int i = 0; i < aeropuerto.getNumCompañia() ; i++) {
           System.out.println(aeropuerto.getCompañia(i).getNombre());
       }
   }
   
   
    public static void MostrarVuelos(Compañia CompañiaEn){
           
           System.out.print("\n Vuelos: ");
                         for (int i = 0; i < CompañiaEn.getNumVuelo(); i++) {
                             System.out.print("\n"+CompañiaEn.getVuelo(i).MostrarVuelo());              
                         }
       }
    
    public static void MostrarVuelos(Vuelo vuelos[]){
        
        if(vuelos.length == 0){
            System.out.println("no se encontrar vuelos con sus especificaciones");
        }else{
            System.out.println("\n Vuelos: ");
            for(Vuelo a: vuelos){
                System.out.println(a.MostrarVuelo());
            }
        }
    }
   
     public static Vuelo[] BuscarVuelos(String CiudadO,String CiudadD,Aeropuerto aeropuertos[]) {
         boolean encontrado = false;
         Compañia com = null;
         Vuelo vue = null;
         int contador=0;
         Vuelo vuelos[];
         
        for(Aeropuerto a: aeropuertos){
            for (int i = 0; i < a.getNumCompañia(); i++) {
                     com = a.getCompañia(i);
                    for (int j = 0; j < com.getNumVuelo(); j++) {
                    vue = com.getVuelo(j);
                    if((vue.getCiudadOrigen().equals(CiudadO)) && (vue.getCiudadDestino().equals(CiudadD))){
                        contador++;
                        
                    }
                }
            }
        }
         
        vuelos = new Vuelo[contador];
        int q=0;
        
        for(Aeropuerto a: aeropuertos){
            for (int i = 0; i < a.getNumCompañia(); i++) {
                     com = a.getCompañia(i);
                    for (int j = 0; j < com.getNumVuelo(); j++) {
                    vue = com.getVuelo(j);
                    if((vue.getCiudadOrigen().equals(CiudadO)) && (vue.getCiudadDestino().equals(CiudadD))){
                        vuelos[q] = vue;
                        q++;
                    }
                }
            }
        }
        
        
        
        return vuelos;
     } 
       
   static public void Menu(){
       String NombreAeropuerto = "";
       String NombreCompañia = "";
        int opcion = 0;
        Aeropuerto AertopuertoEn; 
        Compañia CompañiaEn;
        
        do{
            
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null
                   ,"----|menu|-------\n "+
                   "\n1. ver Aeropuertos Gestionados"+
                   "\n2. ver Empresas"+
                   "\n3. Buscar Compañias por Aerouerto"+
                   "\n4. Lista de vuelos por "+
                   "\n5. Listar posibles vuelos de origen a destino"+
                   "\n6. Salir"+
                   "\n\n Elige una opcion:"));                                                                                                        
           switch(opcion){
               case 1:          
                   MostrarAeropuertos(Aeropuertos);
                   break; 
               case 2:
                   MostrarEmpresas(Aeropuertos);
                   break;
               case 3:
                   System.out.print("\nIngrese el nombre del aeropuerto a buscar: ");
                   NombreAeropuerto = teclado.nextLine();
                   
                  AertopuertoEn = BuscarAeropuerto(NombreAeropuerto, Aeropuertos);
                  
                  if(AertopuertoEn != null){
                      System.out.println("aeropuerto encotrado");
                      MostrarCompañias(AertopuertoEn);
                  }else{
                      System.out.println("aeropuerto no se encontro");
                  }
                   break;
               case 4:
                   System.out.print("\nIngrese el nombre del aeropuerto a buscar: ");
                   NombreAeropuerto = teclado.nextLine();
                   
                  AertopuertoEn = BuscarAeropuerto(NombreAeropuerto, Aeropuertos);
                  
                  if(AertopuertoEn != null){
                      System.out.println("aeropuerto encotrado");
                      
                      System.out.print("\nIngrese el nombre de la compañia: ");
                      NombreCompañia = teclado.nextLine();
                      
                     if(AertopuertoEn.getCompañia(NombreCompañia)!= null){
                         System.out.println("Compañia encontrada");
                         
                         CompañiaEn = AertopuertoEn.getCompañia(NombreCompañia);
                         
                         MostrarVuelos(CompañiaEn);
                         
                     }else{
                         System.out.println("Compañia no encontrada");
                     }
                        
                  }else{
                      System.out.println("aeropuerto no se encontro");
                  }
                   
                   break;
               case 5: 
                   String origen="";
                   String destino="";
                   System.out.print("Ingrese el lugar De Origen: ");
                   origen = teclado.nextLine();
                   
                   System.out.print("Ingrese el lugar De Destino: ");
                   destino = teclado.nextLine();
                   
                   MostrarVuelos(BuscarVuelos(origen, destino, Aeropuertos));
                   
                   break;
           }
            
        }while(opcion != 6);
    }
}
   
  
