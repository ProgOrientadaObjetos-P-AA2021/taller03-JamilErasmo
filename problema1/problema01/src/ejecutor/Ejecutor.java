/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;
import Terreno.Terreno;

/**
 *
 * @author USUARIO PC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terreno terreno = new Terreno();
        Terreno terreno02 = new Terreno();
        terreno.establecerAncho(300);
        terreno.establecerLargo(300);
        terreno.establecerValorMentros(300);
        terreno.calcularArea();
        terreno.calcularCosto();
        terreno02.establecerAncho(3000);
        terreno02.establecerLargo(300);
        terreno02.establecerValorMentros(300);
        terreno02.calcularArea();
        terreno02.calcularCosto();
        System.out.printf("Terreno 1\nArea = %.2f\nCosto: %.2f\n", 
                terreno.obtenerArea(), terreno.obtenerCosto());
        System.out.printf("Terreno 2\nArea = %.2f\nCosto: %.2f\n", 
                terreno02.obtenerArea(), terreno02.obtenerCosto());
    }
}