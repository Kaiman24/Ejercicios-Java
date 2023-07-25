/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej17;

import java.io.IOException;

public class Prueba {
        
        public static void main(String[] args) {
		try {
			throw new ExcepcionA("Excepcion A");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			throw new ExcepcionB("Excepcion B");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			throw new NullPointerException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
