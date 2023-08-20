/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args)
    {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
        
        System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el monto a depositar para cuenta1: "); 
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito); 
        
        System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble(); 
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
         montoDeposito);
        cuenta2.depositar(montoDeposito);
        
        System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo()); 
        
    }
    
}
