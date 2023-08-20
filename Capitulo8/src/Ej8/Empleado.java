/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

/**
 *
 * @author k2g9d
 */
public class Empleado {
    private String nombre;
	private String apellido;
	private Fecha fechaNacimiento;
	private Fecha fechaContratacion;
	
	public Empleado(String nombre, String apellido, Fecha fechaNacimiento, 
			Fecha fechaContratacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
	}
	
	// Convierte a Empleado a formato String
	public String toString() {
		return String.format("%s, %s Contratado: %s Cumpleanios: %s", 
				apellido, nombre, fechaContratacion, fechaNacimiento);
	}
}
