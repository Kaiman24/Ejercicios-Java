/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo2;

/**
 *
 * @author k2g9d
 */
import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       int numero1;       
       int numero2;
       
       System.out.print("Escriba el primer numero: ");
       numero1 = entrada.nextInt();
       
       System.out.print("Escriba el segundo numero: ");
       numero2 = entrada.nextInt();
       
       
       System.out.println("La suma de los dos numeros es: "+(numero1+numero2));
       System.out.println("La diferencia de los dos numeros es: "+(numero1-numero2));
       System.out.println("El producto de los dos numeros es: "+(numero1*numero2));
       System.out.println("El cociente de los dos numeros es: "+(numero1/numero2));
    }
}
