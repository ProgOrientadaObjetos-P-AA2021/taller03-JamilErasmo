/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celular;
import problema04.Celular;
/**
 *
 * @author Usuario iTC
 */
public class ejecutar {
    public static void main(String[] args) {
        
   Celular celular = new Celular();
        celular.establecerSistema("Android");
        celular.establecerTamaño(20);
        celular.establecerCosto(400);
        celular.establecerDireccionMac("05;71;48;59");
        celular.establecerInformacionIMEI("123456789012345");
        System.out.printf("Tipo de sistema: %s\nTamaño de pantalla: "
                + "%.2f\nCosto: %.2f\nDireccion Mac: %s\nInformaición "
                + "IMEI: %s\n", celular.obtenerSistema(),
                celular.obtenerTamaño(), celular.obtenerCosto(),
                celular.obtenerDireccionMac(), celular.obtenerInformacionIMEI()); 
}
}