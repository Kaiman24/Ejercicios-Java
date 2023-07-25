/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej19;

/**
 *
 * @author k2g9d
 */
public class UnaClase {
    private int number;

	public UnaClase(int number) throws Exception {
		if (number < 0) {
			throw new Exception("El numero debe ser mayor o igual a cero");
		}
		
		this.number = number;
	}
}   
