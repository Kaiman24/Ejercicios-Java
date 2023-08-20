/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej29;

import java.util.Scanner;

public class Fibonacci {
    
    public int Principal(int n)
 {      
 int fibonaccin2 = 1;
 int fibonaccin1 = 0;
 int fibonaccin = 0;
 Scanner entrada = new Scanner(System.in);

 for ( int i = 3; i <= n; i++)
 {
 fibonaccin = fibonaccin2 + fibonaccin1;
 fibonaccin1 = fibonaccin2; 
 fibonaccin2 = fibonaccin;
 } 

 return fibonaccin;
 } 
    
}
