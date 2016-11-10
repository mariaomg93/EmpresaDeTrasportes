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
public class EnvioAzul extends Envio {

    private int valor;
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void mostrar(){
        System.out.println(this.valor);
        super.mostrar();
    }
    
}
