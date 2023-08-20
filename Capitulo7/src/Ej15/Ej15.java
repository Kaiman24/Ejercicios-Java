/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej15;

import java.util.Scanner;

public class Ej15 {
    
    public static void main(String args[])
 {      
 Scanner entrada = new Scanner(System.in);
 int arreglo[];
 int numero = 10;

 System.out.println("\nPor favor introduzca el tamanio del arreglo.");
 numero = entrada.nextInt();
 
 arreglo = new int[numero];
 System.out.printf("%s%8s\n", "Indice", "Valor");
 
 
 for ( int contador = 0; contador < arreglo.length; contador++ )
 System.out.printf("%5d%8d\n", contador, arreglo[contador]);
 
 }
    
}
