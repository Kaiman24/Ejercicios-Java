/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;


/**
 *
 * @author k2g9d
 */
public class Cuenta {
        private String nombre;
        private double saldo;
        
        
        public Cuenta(String nombre, double saldo)
        {
            this.nombre = nombre;
            
            if (saldo > 0.0)
                this.saldo = saldo;
        }
        
        public void depositar(double montoDeposito)
        {
            if (montoDeposito > 0.0)
            saldo = saldo + montoDeposito;
        }
        
        public double obtenerSaldo()
        {
           return saldo; 
        }
        
        public void retirar(double montoRetiro)
        {
            if (montoRetiro < saldo)
             saldo = saldo - montoRetiro;
        }
        
        public double obtenerRetiro()
        {
           return saldo; 
        }
        
        public void establecerNombre(String nombre)
        {
            this.nombre = nombre;
        }
        
        public String obtenerNombre()
        {
            return nombre;
        }
        
        
}
