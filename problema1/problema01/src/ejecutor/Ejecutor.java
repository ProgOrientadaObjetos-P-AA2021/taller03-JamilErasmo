/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;
import Resolucion.Terreno;

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
        Terreno terreno2 = new Terreno();
        terreno.establecerAncho(100);
        terreno.establecerLargo(100);
        terreno.establecerValorMentros(100);
        terreno.calcularArea();
        terreno.calcularCosto();
        terreno2.establecerAncho(1500);
        terreno2.establecerLargo(100);
        terreno2.establecerValorMentros(100);
        terreno2.calcularArea();
        terreno2.calcularCosto();
        System.out.printf("Terreno 1\nArea = %.2f\nCosto: %.2f\n", 
                terreno.obtenerArea(), terreno.obtenerCosto());
        System.out.printf("Terreno 2\nArea = %.2f\nCosto: %.2f\n", 
                terreno2.obtenerArea(), terreno2.obtenerCosto());
    }
}