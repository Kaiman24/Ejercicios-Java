/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BarajandoCartas;

/**
 *
 * @author k2g9d
 */
public class PruebaPaqueteDeCartas {
    
public static void main(String args[])
 {     // Abre main
  PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
  miPaqueteDeCartas.barajar();
  
  ///////////////////////////////////
  // IMPRIME
  //////////////////////////////////

 System.out.println("\n");
 for ( int i = 0; i < 13; i++ )
 { // Abre for
 System.out.printf("%-20s%-20s%-20s%-20s\n", 
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
 }  // Cierra for

 System.out.println("\n");
 }    
    
    
}
