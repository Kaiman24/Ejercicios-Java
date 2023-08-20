/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4;

import java.util.Scanner;

public class ej17 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int km;
        int litros;
        int kmtotal = 0;
        int litrostotal = 0;
        
        
        System.out.print("Ingrese los kilometros recorridos o -1 para terminar el calculo(Use enteros): ");
        km = entrada.nextInt();

        System.out.print("Ingrese los litros de gasolina utilizados (Use enteros): ");
        litros = entrada.nextInt();
        
        while (km != -1 && litros !=-1)
        {
            double kmlitro = (double) litros/km;
            kmtotal = kmtotal + km;
            litrostotal = litrostotal + litros;
                
            System.out.println("En este viaje se gasto: "+kmlitro+" litros por kilometro");
            System.out.println("");
            
            System.out.print("Ingrese los kilometros recorridos o -1 para terminar el calculo(Use enteros): ");
            km = entrada.nextInt();

            System.out.print("Ingrese los litros de gasolina utilizados (Use enteros): ");
            litros = entrada.nextInt();
               
        } 
        
        double kmlitro_total = (double) litrostotal/kmtotal;
        
        System.out.println("");
        System.out.println("En total se gasto: "+kmlitro_total+" litros por kilometro, en "+kmtotal+"km"); 
    }
    
}
