/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo5;

import java.util.Scanner;
public class ej17 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        int producto;
        int cantidad;
        double total=0, total2=0, total3=0, total4=0, total5=0;
        
        System.out.println("Precios de venta son los siguientes: "
                + "Producto 1, $2.98; producto 2, $4.50; producto 3, $9.98; producto 4, $4.49 y producto 5, $6.87.");
        
        System.out.println("");
        System.out.print("Ingrese el numero del prducto o -1 para salir del programa: ");
        producto = entrada.nextInt();
        
        System.out.print("Ingrese la cantidad vendida o -1 para salir del programa: ");
        cantidad = entrada.nextInt();
        
            if (producto>0 && producto<=5){
                while (producto != -1 && cantidad !=-1)
                {
                    switch (producto){
                        case 1:
                            total = 2.98*cantidad;
                            break;
                        case 2:
                            total2 = 4.50*cantidad;
                            break;
                        case 3:
                            total3 = 9.98*cantidad;
                            break;
                        case 4:
                            total4 = 4.49*cantidad;
                            break;
                       case 5:
                            total5 = 6.87*cantidad;
                            break;    
                    }
                        
                    System.out.println("");
                    System.out.print("Ingrese el numero del prducto o -1 para salir del programa: ");
                    producto = entrada.nextInt();
        
                    System.out.print("Ingrese la cantidad vendida o -1 para salir del programa: ");
                    cantidad = entrada.nextInt();            
                }
            }
        else
            {
                System.out.println("Ingrese un numero de producto valido");
            }
            
            System.out.println("Se ha vendido lo siguiente: "
                    + "\"Producto 1, "+total+"; producto 2,"+total2+"; producto 3,"+total3+"; producto 4"+total4+"; y producto 5, "+total5);
        
    }
   
}
