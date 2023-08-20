/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            double art;
            double total = 0;
            
            System.out.print("Ingrese el precio del articulo vendido o -1 para salir: ");
            art = entrada.nextInt();
        
            while (art !=-1)
            {
                total = total + art;
                
                System.out.print("Ingrese el precio del articulo vendido o -1 para salir: ");
                art = entrada.nextInt();
            }
   
            double ingresos = 200 + (total * 0.09);
            
            System.out.println("Los ingresos de esta semana son: "+ingresos+" lempiras");
            System.out.println(total);
    
    
    }
    
}
