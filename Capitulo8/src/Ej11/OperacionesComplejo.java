/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author k2g9d
 */
public class OperacionesComplejo {
    
    public static void main(String[] args) {
		
		Complejo num1 = new Complejo();
		Complejo num2 = new Complejo(4, 7);
		
		System.out.println("Suma de complejos: (" + num1 + ") + (" + num2 + ")");
		System.out.print("R = ");
		sumarComplejos(num1, num2);
		System.out.println("\nResta de complejos: (" + num1 + ") - (" + num2 + ")");
		System.out.print("R = ");
		restarComplejos(num1, num2);
		
	}
	
	private static void sumarComplejos(Complejo a, Complejo b) {
	
		System.out.printf("%.0f + %.0fi", 
				a.getReal() + b.getReal(), 
				a.getImaginario() + b.getImaginario());
		
	}
	
	public static void restarComplejos(Complejo a, Complejo b) {
		
		System.out.printf("%.0f + %.0fi",
				a.getReal() - b.getReal(), 
				a.getImaginario() - b.getImaginario());
		
	}
    
}
