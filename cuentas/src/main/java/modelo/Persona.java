/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pablo
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int id;
    private String ocupacion;
    private boolean activo;

    public Persona() {
        this.nombre = "default";
        this.edad = 0;
        this.ocupacion = "ocuDefault";
        this.activo = false;
        this.id = 000;
    }

    public Persona(String nombre, int edad, int id, String ocupacion, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.activo = activo;
        this.id = id;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void personaAtributos(){
        System.out.println("Nombre: " + this.getNombre());
    }
    
    
    
}
