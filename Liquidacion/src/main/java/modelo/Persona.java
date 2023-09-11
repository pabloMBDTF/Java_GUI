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
    private float base;
    private float eps;
    private float salud;
    
    public Persona(){
        this.base = 0.0f;
        this.eps = 0.0f;
        this.salud = 0.0f;
    }
    
    public Persona(float base){
        this.base = base;
        this.eps = 0.0f;
        this.salud = 0.0f;
    }

    public float getBase() {
        return base;
    }

    public float getEps() {
        return eps;
    }

    public float getSalud() {
        return salud;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setEps(float eps) {
        this.eps = eps;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }
 
    public float calcEps(){
        float resultado = this.base * 0.04f;
        setEps(resultado);
        return eps;
    }
    
    public float calcSalud(){
        float resultado = this.base * 0.04f;
        setSalud(resultado);
        return salud;

    }
    
    
}
