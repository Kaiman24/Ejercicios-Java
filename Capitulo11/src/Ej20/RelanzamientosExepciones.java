/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej20;

/**
 *
 * @author k2g9d
 */
public class RelanzamientosExepciones {
    
        public static void main(String[] args) {
		try {
			someMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void someMethod() throws Exception {
		try {
			someMethod2();
		} catch (Exception e) {
			throw new Exception("Exception thrown in someMethod");
		}
	}

	public static void someMethod2() throws Exception {
		throw new Exception("Exception thrown in someMethod2");
	}
}
