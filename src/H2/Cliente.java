/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H2;

/**
 *
 * @author ESTHER
 */
public class Cliente extends Persona{
public Cliente(String Nombre, String cedula,int edad,double salario  ) {
super(Nombre,cedula,edad,salario);
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
ublic class Vendedor extends Persona{
public Vendedor(String Nombre, String DNI,String Apellidos ) {
super(Nombre, DNI,Apellidos);
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


}
