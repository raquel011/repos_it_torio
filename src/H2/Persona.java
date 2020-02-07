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


public class Persona {
	
 private String Nombre;
 private String cedula;
 private int edad;
  private double salario;


    public Persona() {
    }


	public Persona(String Nombre, String cedula, int edad, double salario) {
		this.Nombre = Nombre;
		this.cedula = cedula;
		this.edad = edad;
                this.salario=salario;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre; 
	}

	
	
	public String getNombre() {
		return (this.Nombre); 
	}

	

	
	public String toString() {

		String sep = System.getProperty("line.separator");

		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("Nombre = ");
		buffer.append(Nombre);
		buffer.append(sep);
		buffer.append("cedula = ");
		buffer.append(cedula);
		buffer.append(sep);
		buffer.append("edad ");
		buffer.append(edad);
		buffer.append(sep);
                buffer.append("salario ");
		buffer.append(salario);
		buffer.append(sep);
		
		return buffer.toString();
	}

    

   
    //............

    public String getCedula() {
        return (this.cedula);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return(this.edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getSalario() {
        return(this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    
}