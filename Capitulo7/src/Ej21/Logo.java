/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej21;

import java.util.Scanner;

public class Logo {
    
Scanner entrada = new Scanner(System.in);
 private int Direccion = 'l';
 private int Pluma = 1; // La pluma inicia hacia arriba
 private int ANCHO_TABLERO = 90;
 private int ALTO_TABLERO = 40;
 private int Tablero[][] = new int[ALTO_TABLERO + 1][ANCHO_TABLERO + 1];
 private int X = 1;  // La tortuga inicia en la parte superior
 private int Y = 1;  // izquierda
 

 public void Administrador_Logo()
 {       

 int comando;

 
 System.out.println("\nPor favor introduzca comando: ");
 comando = entrada.nextInt();

 while ( 0 != comando )
 {     
 switch (comando)
 { 
 case 1:
 System.out.println("\nLa pluma esta hacia arriba.");
 Pluma = 1;
 break;
 case 2:
 System.out.println("\nLa pluma esta hacia abajo.");
 Pluma = 2;
 break;

 case 3:
 System.out.println("\nSe gira a la derecha.");
 switch (Direccion)
 {  
 case 'k':
 Direccion = 'l';
 break;
 case 'l':
 Direccion = 'j';
 break;
 case 'j':
 Direccion = 'h';
 break;
 case 'h':
 Direccion = 'k';
 break;
 default:
 System.out.println("\nDireccion Invalida");
 break; 
 }  
 break;

 case 4:
 System.out.println("\nSe gira a la izquierda");
 switch (Direccion)
 {     
 case 'k':
 Direccion = 'h';
 break;
 case 'h':
 Direccion = 'j';
 break;
 case 'j':
 Direccion = 'l';
 break;
 case 'l':
 Direccion = 'k';
 break;
 default:
 System.out.println("\nDireccion invalida.");
 break;
 }    
 break;

 case 5:
 Avanza();
 break;
 case 6:
 Imprimir_Tablero();
 break;
 case 7:
 System.out.printf("\nLa direccion de la tortuga es: %c", Direccion);
 System.out.printf("\nLa posicion de la tortuga es X = %d, Y = %d\n", X, Y);
 break;
 case 8:
 System.out.println("\nLos comandos son:");
 Imprimir_Comandos();
 break;

 default:
 System.out.println("\nComando invalido.\n");
 break;
  
 }   //
 System.out.print("\nPor favor introduzca comando, 0 para terminar, ");
 System.out.print("8 para imprimir los comandos.\n");
 comando = entrada.nextInt();
 
 }     
 }       
 
 public void Avanza()
 {       
 int casillas_avanza;
 System.out.println("\nPor favor introduzca las posiciones que avanzara la tortuga: ");
 casillas_avanza = entrada.nextInt();
 switch (Direccion)
 {     
 case 'l':
 
 if ( X + casillas_avanza <= ANCHO_TABLERO)
 
 {  
 if ( 1 != Pluma)
 for ( int i = X; i <= X + casillas_avanza; i++ )
 Tablero[Y][i] = 1; 


 X += casillas_avanza;
 
 }  
 else
 { 
 if ( 1 != Pluma )
 for ( int j = X; j <= ANCHO_TABLERO; j++ )
 Tablero[Y][j] = 1;
 X = ANCHO_TABLERO;

 } 
 break;

 case 'h':
 if ( 1 <= X - casillas_avanza )
 {  
 if ( 1 != Pluma )
 for ( int i = X; i >= X - casillas_avanza; i--)
 {  
 Tablero[Y][i] = 1; 
 }  
 
 X -= casillas_avanza;
 } 
 else  
 {    
 if ( 1 != Pluma )
 for ( int i = X; i >= 1; i--)
 Tablero[Y][i] = 1;

 X = 1; 
 }   
 break;

 case 'j':
 if ( Y + casillas_avanza <= ALTO_TABLERO)
 
 { 
 if ( 1 != Pluma) 
 for ( int i = Y; i <= Y + casillas_avanza; i++ )
 Tablero[i][X] = 1; 

 
 Y += casillas_avanza;
 
 }  
 else
 {  
 if ( 1 != Pluma )
 for ( int j = Y; j <= ALTO_TABLERO; j++ )
 Tablero[j][X] = 1;
 Y = ALTO_TABLERO;
 
 } 
 break;
 
 case 'k':

 if ( 1 <= Y - casillas_avanza )
 {  
 if ( 1 != Pluma )
 for ( int i = Y; i >= Y - casillas_avanza; i--)
 {  
 Tablero[i][X] = 1; 
 }  
 
 Y -= casillas_avanza;
 }  
 else  
 {    
 if ( 1 != Pluma )
 for ( int i = Y; i >= 1; i--)
 Tablero[i][X] = 1;

 Y = 1; 
 }    
 break;

 default:
 System.out.println("\nDireccion equivocada.");
 break; 
 }    
 }       
 public void Imprimir_Tablero()
 {    

 System.out.printf("\nEl Tablero es de %d de ancho X %d de alto\n", ANCHO_TABLERO, ALTO_TABLERO);

 System.out.printf("|");
 for ( int n = 1; n <= ANCHO_TABLERO; n++ )
 System.out.printf("-");

 System.out.printf("|\n");

 for ( int i = 1; i <= ALTO_TABLERO; i++ )
 {   
 System.out.printf("|");

 for ( int j = 1; j <= ANCHO_TABLERO; j++ )
 {  
 if ( 0 == Tablero[i][j])
 System.out.printf(" ");
 else
 System.out.printf("*");
 }      
 System.out.printf("|%d\n", i);
 }  

 
 System.out.printf("|");
 for ( int m = 1; m <= ANCHO_TABLERO; m++ )
 System.out.printf("-");
 System.out.printf("|");
 
 
 }    

 public void Imprimir_Comandos()
 {     
 System.out.println("\n1 Pluma hacia arriba.");
 System.out.println("2 Pluma hacia abajo.");
 System.out.println("3 Gira a la derecha.");
 System.out.println("4 Gira a la izquierda.");
 System.out.println("5 Avanza.");
 System.out.println("6 Imprime Tablero.");
 System.out.println("7 Imprime Posicion y Direccion.");
 System.out.println("8 Imprime comandos.");
 }   
    
}
