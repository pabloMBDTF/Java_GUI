/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Aplicacion {
    
    private String nombre;
    private ArrayList<Persona> personas;

    public Aplicacion() {
        this.nombre = "default";
    }

    
    public Aplicacion(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirPersona(Persona persona){
        personas.add(persona);
        System.out.println("la persona " + persona.getNombre() + " se ha añadido");
    }
    
    public void verPersonas(){
        for (int i=0; i < personas.size(); i++){
            Persona per = personas.get(i);
            per.personaAtributos();
        }
    }
    
}
