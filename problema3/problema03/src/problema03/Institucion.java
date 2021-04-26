/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;
import problema03.Institucion;

/**
 *
 * @author Usuario iTC
 */
public class Institucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Institucion institucion1 = new Institucion();
        Institucion institucion2 = new Institucion();
        Institucion institucion3 = new Institucion();
        institucion1.establecerNombre("UTPL");
        institucion1.establecerTipoIns("Privada");
        institucion1.establecerNumeroDocentes(200);
        institucion1.establecerNumeroCedes(15);
        institucion2.establecerNombre("UNL");
        institucion2.establecerTipoIns("Publica");
        institucion2.establecerNumeroDocentes(100);
        institucion2.establecerNumeroCedes(2);
        institucion3.establecerNombre("UIDE");
        institucion3.establecerTipoIns("Privada");
        institucion3.establecerNumeroDocentes(110);
        institucion3.establecerNumeroCedes(40);
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion.obtenerNombre(), institucion.obtenerTipoIns(),
                institucion.obtenerNumeroDocentes(), institucion.obtenerNumeroCedes());    
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion2.obtenerNombre(), institucion2.obtenerTipoIns(),
                institucion2.obtenerNumeroDocentes(), institucion2.obtenerNumeroCedes());  
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion3.obtenerNombre(), institucion3.obtenerTipoIns(),
                institucion3.obtenerNumeroDocentes(), institucion3.obtenerNumeroCedes());
    }
}