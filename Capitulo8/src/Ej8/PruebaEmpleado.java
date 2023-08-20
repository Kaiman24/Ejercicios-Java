/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

/**
 *
 * @author k2g9d
 */
public class PruebaEmpleado {
    
    public static void main(String[] args) {
		
		Fecha nacimiento = new Fecha(12, 31, 1949);
		Fecha contratacion = new Fecha(2, 29, 2020);
		
		Empleado empleado = new Empleado("Bob", "Blue", nacimiento, contratacion);
		
		System.out.println(empleado);
		
		nacimiento.incrementarDia();
		System.out.println(empleado);
		contratacion.incrementarDia();
		System.out.println(empleado);
		
	}
    
}
