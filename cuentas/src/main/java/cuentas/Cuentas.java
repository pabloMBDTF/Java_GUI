/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cuentas;

/**
 *
 * @author pablo
 */

import modelo.Aplicacion;
import modelo.Persona;
import vista.VentanaMain;


public class Cuentas {

    public static void main(String[] args) {
        Aplicacion app = new Aplicacion("nombre");
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        app.añadirPersona(p1);
        app.añadirPersona(p2);
        app.añadirPersona(p3);
        
        app.verPersonas();
        
        
        VentanaMain local = new VentanaMain();
        
        
        
        
    }
}
