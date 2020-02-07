/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

public abstract class Cuenta {
	protected  int numeroCuenta;
	protected double Saldo;
	protected Persona Cliente;
	
    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, Persona Cliente) {
    this.numeroCuenta=numeroCuenta;
    this.Saldo=5.0;

    this.Cliente=Cliente;
    }
    
        
    public abstract void retirar();
    
        
  //public void actualizarSaldo()
    //{
    	
    

   	protected Cuenta(int numeroCuenta, double Saldo, Persona Cliente) {
		this.numeroCuenta = numeroCuenta;
		this.Saldo = Saldo;
		this.Cliente = Cliente;
	}
	
	protected void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta; 
	}

	protected void setSaldo(double Saldo) {
		this.Saldo = Saldo; 
	}

	protected void setCliente(Persona Cliente) {
		this.Cliente = Cliente; 
	}

	protected int getNumeroCuenta() {
		return (this.numeroCuenta); 
	}

	protected double getSaldo() {
		return (this.Saldo); 
	}

	protected Persona getCliente() {
		return (this.Cliente); 
	}

	public String toString() {

		String sep = System.getProperty("line.separator");

		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("numeroCuenta = ");
		buffer.append(numeroCuenta);
		buffer.append(sep);
		buffer.append("Saldo = ");
		buffer.append(Saldo);
		buffer.append(sep);
		buffer.append("Cliente = ");
		buffer.append(Cliente);
		buffer.append(sep);
		
		return buffer.toString();
	}
    
    
    
    
    
}
