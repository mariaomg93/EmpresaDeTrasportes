/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

/**
 *
 * @author usuario
 */
public class Envio24h extends Envio{
    
    private String prioridad;

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public void mostrar(){
        System.out.println(this.prioridad);
        super.mostrar();
    
    }
    
}
