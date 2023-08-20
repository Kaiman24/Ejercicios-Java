/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author k2g9d
 */
public class Complejo {
    private float real;
	private float imaginario;
	
	public Complejo() {
		this.real = 1;
		this.imaginario = 1;
	}
	
	public Complejo(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public float getReal() {
		return real;
	}
	
	public void setReal(float real) {
		this.real = real;
	}
	
	public float getImaginario() {
		return imaginario;
	}
	
	public void setImaginario(float imaginario) {
		this.imaginario = imaginario;
	}
	
	public String toString() {
		return String.format("%.0f + %.0fi", getReal(), getImaginario());
	}
}
