/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej18;


public class OrdenBloquesCatch {
    
    public static void main(String[] args) {
		
        //orden correcto de los catch:
            try {
			int n = 7 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

            
            /*
		try {
			int n = 7 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
            	}
	*/
        }
}
