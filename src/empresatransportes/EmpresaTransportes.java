/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransportes;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EmpresaTransportes {
public static ArrayList <Envio> envios= new ArrayList <>();
public static ArrayList <Vehículo> vehiculos= new ArrayList <>();
    
    public static void rellenarDatos(){
    
    for(int a=0;a<10;a++){    
        Envio e= new Envio();
        e.setFecha("11 de Noviembre");
        e.setPeso(10);
         envios.add(e);
    }
    
    for(int a=0;a<10;a++){
            EnvioAzul ea= new EnvioAzul ();
            ea.setValor(100+a);
            ea.setFecha("11 de Noviembre");
            ea.setPeso(10);
            envios.add(ea);
        }
    
    for(int a=0;a<10;a++){
            Envio24h e24= new Envio24h ();
            e24.setPrioridad("ALTA"); 
            e24.setFecha("11 de Noviembre");
            e24.setPeso(10);
            envios.add(e24);
        }    
    
    
        for(int a=0;a<21;a++){
        Empleado e= new Empleado();
        e.setNombre("EMPLEADO"+a);
        e.setEdad(18+a);       
        }
    
    }
    public static void mostrarTodosLosEnvios(){
        //MUESTRA TODOS LOS ENVÍOS.
        for(int a=0;a<envios.size();a++){
            envios.get(a).mostrar();        
        }    
    }
    
    public static void mostrarEnvio24hMayorpeso(){
        //MUESTRA EL ENVÍO 24H DE MAYOR PESO.
        int max=0;
        Envio24h e2 = null;
        for(int a=0;a<envios.size();a++){ 
            if(envios.get(a) instanceof Envio24h){
                if(envios.get(a).getPeso()>max){
                    max=(int) envios.get(a).getPeso();
                    e2=(Envio24h) envios.get(a);
                }            
            }            
        }
        System.out.println( e2.getPeso() + " " + e2.getFecha() +" "+ e2.getPrioridad()  );
    }
    
    
    public static void mostrarSumaPesosPorTipoDeEnvios(){
        int suma1=0;
        int suma2=0;
        EnvioAzul ea = null;
        Envio24h e24= null;
        for(int a=0;a<envios.size();a++){
            if(envios.get(a) instanceof EnvioAzul){
                suma1=(int) (suma1+ea.getPeso());  
                System.out.println(suma1);
            }
            else {
                suma2=(int) (suma2+e24.getPeso());
                System.out.println(suma2);
            }        
        }    
    }
    
    
    public static void asignarEmpleadoAVehiculo(){
    
    
        
    
    
    }
    
    
    public static void main(String[] args) {
       
     rellenarDatos();
     // mostrarTodosLosEnvios();
     // mostrarEnvio24hMayorpeso();
     //mostrarSumaPesosPorTipoDeEnvios();
     //asignarEmpleadoAVehiculo();
        
        
        
    }
    
}
