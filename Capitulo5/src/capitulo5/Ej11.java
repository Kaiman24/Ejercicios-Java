/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo5;

import java.util.Scanner;

public class Ej11 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int contador;
        int min = 0;
        
        System.out.print("Ingrese un entero (este determinara tambien la cantidad de enteros que seran ingresados: ");
        contador = entrada.nextInt();
        
        for (int i = 1; i < contador; i++){
            int x;
            System.out.print("Ingrese un entero: ");
            x = entrada.nextInt();
            
            if (x < contador)
                min = x;
            else
                min = contador;
            
        }
        System.out.println("El menor de todos los enteros es: "+min);
            
        
    }
    
}
