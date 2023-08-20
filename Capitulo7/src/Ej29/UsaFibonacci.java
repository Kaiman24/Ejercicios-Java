/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej29;

 import java.util.Scanner;

public class UsaFibonacci {
    
 public static void main(String args[])
 {   // Abre main
 int numero;
 Scanner entrada = new Scanner(System.in);

 Fibonacci miObjeto = new Fibonacci();
 System.out.println("\nEste programa calcula numeros de Fibonacci.");
 do
 {
 System.out.println("Que numero de Fibonacci quiere?");
 System.out.println("\nEl numero debe ser positivo.");
 numero = entrada.nextInt(); 
 } while ( 0 > numero );
 if ( 1 == numero )
 
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 0);
 else
 {
    if ( 2 == numero )
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 1);
    if ( 2 != numero)
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, miObjeto.Principal(numero)); 
 }
 }   
    
}
