/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej21;


public class ExpecionesAlcancesExteriores {
        public static void main(String[] args) {
		try {
			doSomething("10");
			doSomething("InvalidInt-10");
			doSomething("0");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled in main");
		}
	}

	public static void doSomething(String numberString) {
		try {
			int number = Integer.parseInt(numberString);

			System.out.println(100 / number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException handled in doSomething");
		}
	}
}
