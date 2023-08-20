/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo2;

import java.util.Scanner;

public class ej17 {
   public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       int numero1;       
       int numero2;
       int numero3;
       
       System.out.print("Escriba el primer numero: ");
       numero1 = entrada.nextInt();
       
       System.out.print("Escriba el segundo numero: ");
       numero2 = entrada.nextInt(); 
       
       System.out.print("Escriba el tercer numero: ");
       numero3 = entrada.nextInt();
       
       System.out.println("La suma de los tres enteros es: "+(numero1+numero2+numero3));
       System.out.println("El producto de los tres enteros es: "+(numero1*numero2*numero3));
       System.out.println("El promedio de los tres enteros es: "+((numero1+numero2+numero3)/3));
       
       int max;
       if (numero1>numero2 && numero1>numero3)
       { max=numero1;
          System.out.println("El numero mayor es: "+max);
       }
       else if (numero2>numero3)
       { max=numero2;
           System.out.println("El numero mayor es: "+max);
       }
       else if (numero3>numero2)
       {  max=numero3;
           System.out.println("El numero mayor es: "+max);
       }      
       
       
       
       
       int min;
       if (numero1<numero2 && numero1<numero3)
       { min=numero1;
          System.out.println("El numero menor es: "+min);
       }
       else if (numero2<numero3)
       { min=numero2;
           System.out.println("El numero mayor es: "+min);
       }
       else if (numero3<numero2)
       {  min=numero3;
           System.out.println("El numero mayor es: "+min);
       }  
       
       
       else
         System.out.println("Los tres numeros son iguales");
       
       
       
   }
   }
