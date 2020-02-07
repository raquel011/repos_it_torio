/**
 * @(#)uno.java
 *
 *
 * @author 
 * @version 1.00 2018/6/19
 */


public class uno {
	private String nombre;
	private String dni;
	private int ordenllegada;

    public uno() {
    	this.nombre="";
    	this.dni="";
    	this.ordenllegada=0;
    }
    public uno(String nombre,String dni,int ordenllegada)
    {
    	this.nombre="raquel";
    	this.dni="235789";
    	this.ordenllegada=1;
    }

	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}

	public void setDni(String dni) {
		this.dni = dni; 
	}

	public void setOrdenllegada(int ordenllegada) {
		this.ordenllegada = ordenllegada; 
	}

	public String getNombre() {
		return (this.nombre); 
	}

	public String getDni() {
		return (this.dni); 
	}

	public int getOrdenllegada() {
		return (this.ordenllegada); 
	}
	


	public String toString() {

		String sep = System.getProperty("line.separator");

		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("nombre = ");
		buffer.append(nombre);
		buffer.append(sep);
		buffer.append("dni = ");
		buffer.append(dni);
		buffer.append(sep);
		buffer.append("ordenllegada = ");
		buffer.append(ordenllegada);
		buffer.append(sep);
		
		return buffer.toString();
	}
    
 
}