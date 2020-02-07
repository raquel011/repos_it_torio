/**
 * @(#)CuentaCorriente.java
 *
 *
 * @author 
 * @version 1.00 2018/3/8
 */


public class CuentaCorriente extends Cuenta{

    public CuentaCorriente() {
    	super();
    }
    public CuentaCorriente(int numeroCuenta, double Saldo, Persona Cliente,double Saldo)
    {
    	super(numeroCuenta,Cliente,Saldo);
    }
    public void ingresarSaldo(double saldo)
    {
    this.setSaldo(this.getSaldo()+saldo);	
    }
    public abstract Retirar(double saldo)
    { boolean validarRetiro=false;
    	if(this.getSaldo()>0))
    		
    		
    }
    
    
}