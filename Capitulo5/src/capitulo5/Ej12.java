/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo5;

/**
 *
 * @author k2g9d
 */
public class Ej12 {
    public static void main(String[] args) {
        int producto = 1;
        
        for (int i = 1; i <= 15; i++){
        if (i%2==1)
            producto = producto * i;
        }
        System.out.println("El producto de los impares del 1 al 15 es: "+producto);
    }
}
