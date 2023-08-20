/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo6;

import java.util.Scanner;
public class ej8 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba las horas que estuvo estacionado el vehiculo: ");
        double horas = entrada.nextDouble();
        
        double resultado = calcularCargos(horas);
        
        System.out.println("El cargo total del cliente es: $" + resultado);
        
    }
    
    public static double calcularCargos(double horas)
    {
        double cargoTotal = 2.00;
            
        if (horas<=3)
        cargoTotal = 2.00;
        
        if (horas>3 && horas<=18)
            cargoTotal = (horas-3)*0.50+2.00;
            
        if (horas>18)
            cargoTotal = 10.00;
        
        return cargoTotal;
    }
    
}
