/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo2;

import java.util.Scanner; 

public class ej25 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       
         int numero1;
         
         System.out.print("Escriba el primer numero: ");
         numero1 = entrada.nextInt();
         
         if (numero1%2==0)
           System.out.println("Ese numero es par");
         else
           System.out.println("Ese numero es impar");
    
    }
    }

