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
public class Cliente extends Persona{

public Cliente(String nombre, String DNI,String Apellidos) {
super(nombre, DNI,Apellidos);
}

public void mostrarNombre() {
System.out.println(getNombre());
}

public void mostrarDNI() {
System.out.println(getDNI());
}
public void mostrarApellidos() {
System.out.println(getApellidos());
}

}

