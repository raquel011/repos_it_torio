
package herencia;

public class CuentaCorriente extends Cuenta{
    
public CuentaCorriente() {
    	super();
}
 public CuentaCorriente(int numeroCuenta, double Saldo, Persona Cliente){
	super(numeroCuenta,Saldo,Cliente);
}   

public void ingresarSaldo(double saldo)
    {
    this.setSaldo(this.getSaldo()+saldo);	
    }

    
    public void retirar() {
        { boolean validarRetiro=false;
    	if(this.getSaldo()>0);
    		
    		
    }
    }
    public static void main(String[] args) {
      CuentaCorriente c=new CuentaCorriente();
      c.ingresarSaldo(0);
      c.retirar();
      
    }

}