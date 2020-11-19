/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author Adolfo
 */
public class Subscriptor implements Observer {

    private String nombre;
    private Canal canalSuscripcion;

    public Subscriptor(String nombre, Canal canalSuscripcion) {
        this.nombre = nombre;
        this.canalSuscripcion = canalSuscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Canal getCanalSuscripcion() {
        return canalSuscripcion;
    }

    public void setCanalSuscripcion(Canal canalSuscripcion) {
        this.canalSuscripcion = canalSuscripcion;
    }
    
    @Override
    public String toString() {
        return "Subscriptor{" + "nombre=" + nombre;
    }

    @Override
    public void update() {
        System.out.println(this.getNombre() + " Hay un nuevo video de: " + 
                canalSuscripcion.getNombre() + " :" + canalSuscripcion.getNuevoVideo());
    
    }
    
    
    
    
}
