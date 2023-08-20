package com.ssbaez.ejercicio811;

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


