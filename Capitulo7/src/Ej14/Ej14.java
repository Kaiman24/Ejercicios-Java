/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

 import java.util.Scanner;

public class Ej14 {
    
  Scanner entrada = new Scanner(System.in);
  int Tamano_Arreglo = 10;
 
 
  public void Recibe()
  {          
  int Arreglo[] = new int[Tamano_Arreglo];

  for (int i = 0; i < Tamano_Arreglo; i++ )
  {     
  System.out.printf("\nPor favor introduzca el numero %d\n", i + 1);
  Arreglo[i] = entrada.nextInt();
  }     

  System.out.printf("\nEl producto es %d\n",  Multiplica( Arreglo ));

  }         
 

 
  public int Multiplica( int A[])
  {  
  int producto = 1;
 
  for ( int j = 0; j < A.length; j++ )
  {     
  producto *= A[j];
  }     

  return producto;
  }
    
}
