/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej26;


 
 
public class Eratostenes {
    private int Tamano_Arreglo = 1000;
    
     public void Principal()
      { 
 boolean Arreglo[];
 Arreglo = new boolean[Tamano_Arreglo + 1];
 for ( int i = 1; i < Tamano_Arreglo; i++ )
 Arreglo[i] = true;

    for ( int j = 2; j <= Tamano_Arreglo; j++ )
 if ( true == Arreglo[j] )
 for ( int k = 2; k <= (Tamano_Arreglo)/j; k++ )
 Arreglo[k*j] = false;

 
    Imprime( Arreglo, Tamano_Arreglo );

 }  


public void Imprime( boolean A[], int Tamano )

 { 
 int contador = 0;

 for ( int m = 2; m <= Tamano; m++ )
 { 
 if ( true == A[m] )
 contador++;
 }


 System.out.printf("\n\nEstos son los %d numeros primos que hay ", contador);
 System.out.printf("entre 1 y %d\n\n", Tamano_Arreglo);

 int salto = 1; 
 for ( int n = 1; n <= Tamano; n++ )
 { 
 
 if ( true == A[n] )
 {
 System.out.printf("%4d\t", n);
 salto++;
 }
 if ( 10 == salto )
 {
 System.out.println();
 salto = 1;
 }
 } 

 System.out.printf("\n");
 }     
             
}
