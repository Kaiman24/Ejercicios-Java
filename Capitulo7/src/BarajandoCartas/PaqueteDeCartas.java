/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BarajandoCartas;

import java.util.Random;

public class PaqueteDeCartas {

private Carta paquete[];
 private int cartaActual;
 private final int NUMERO_DE_CARTAS = 52;
 private Random numerosAleatorios;



 public PaqueteDeCartas()
 {   

 String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
 "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
 String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

 paquete = new Carta[ NUMERO_DE_CARTAS ];
 cartaActual = 0;
 numerosAleatorios = new Random();

 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
 paquete[ cuenta ] = new Carta( caras[cuenta % 13], palos[cuenta/13]); 
 }  


 

 public void barajar()
 {  
 cartaActual = 0;
 
 for ( int primera = 0; primera < paquete.length; primera++ )
 { 
 int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
 
 Carta temp = paquete[primera];

 paquete[primera] = paquete[segunda];
 paquete[segunda] = temp;
 
 }  
 }   

 public Carta repartirCarta()
 {  
 if (cartaActual < paquete.length )
 return paquete[cartaActual++];
 else return null;
 }

    
}
