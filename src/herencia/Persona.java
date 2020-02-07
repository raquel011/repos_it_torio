/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;




public class Persona {
	private String Nombre;
	private String Apellidos;
	String DNI;

    public Persona() {
    }


	public Persona(String Nombre, String Apellidos, String DNI) {
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.DNI = DNI;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre; 
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos; 
	}

	public void setDNI(String DNI) {
		this.DNI = DNI; 
	}

	public String getNombre() {
		return (this.Nombre); 
	}

	public String getApellidos() {
		return (this.Apellidos); 
	}

	public String getDNI() {
		return (this.DNI); 
	}

	public String toString() {

		String sep = System.getProperty("line.separator");

		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("Nombre = ");
		buffer.append(Nombre);
		buffer.append(sep);
		buffer.append("Apellidos = ");
		buffer.append(Apellidos);
		buffer.append(sep);
		buffer.append("DNI = ");
		buffer.append(DNI);
		buffer.append(sep);
		
		return buffer.toString();
	}
    
    
    
}