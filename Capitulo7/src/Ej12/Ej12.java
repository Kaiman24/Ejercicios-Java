/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

import java.util.Scanner;

public class Ej12 {
    
Scanner entrada = new Scanner(System.in);
 enum Estado {SI, NO};
 private int Tamano = 5;
 private int numero;
 private int numeros_recibidos = 0;
 Estado almacenar;
 Estado imprimir;
 int Arreglo[] = new int[Tamano];


 public void Recibe()
 { 

 for ( int n = 0; n <  Tamano; n++ )
 {  

 numero = 0;
 while ( (10 > numero) || ( 100 < numero) )
 {
 System.out.println("\nEscriba un numero entre 10 y 100 \n");
 numero = entrada.nextInt();
 }

 Arreglo[n] = numero;
 numeros_recibidos++;
 Imprime();
 }   
 System.out.println("\n");

 }  
 
 public void Imprime()
 {     
 System.out.printf("\nLos numeros recibidos: %d", numeros_recibidos);
 imprimir = Estado.SI;

 System.out.printf("\n%d", Arreglo[0]);

 for ( int j = 1; j < numeros_recibidos; j++ )
 { 
 imprimir = Estado.SI;

 for ( int k = 0; k < j; k++)
 {
 if ( Arreglo[j] == Arreglo[k] )
 imprimir = Estado.NO;
 }

 if ( Estado.SI == imprimir )
 {
 System.out.printf("\n%d", Arreglo[j]);
 }
 } 
 } 
}
