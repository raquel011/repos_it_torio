/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h;

/**
 *
 * @author ESTHER
 */
public class main {
 
    public static void main(String[] args){
     
     
     Vendedor v = new Vendedor("Flavio","45675432","alvarado");
     Cliente c=new Cliente("devora","4321234","rosas");
        System.out.println("datos de los vendedores");
     v.mostrarNombre();
     v.mostrarApellidos();
     v.mostrarDNI();
        System.out.println("datos de los clientes");
     c.mostrarNombre();
     c.mostrarApellidos();
     c.mostrarDNI();
     
          
    }
     
     
}