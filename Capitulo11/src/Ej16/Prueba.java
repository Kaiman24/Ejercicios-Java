/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej16;

/**
 *
 * @author k2g9d
 */
public class Prueba {
    
    public static void main(String[] args) {
		try {
			throw new ExcepcionB("Excepcion B");
		} catch (ExcepcionA e) {
			e.printStackTrace();
		}

		try {
			throw new ExcepcionC("Excepcion C");
		} catch (ExcepcionA e) {
			e.printStackTrace();
		}
	}
}
