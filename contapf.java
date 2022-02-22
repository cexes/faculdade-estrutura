
public class Contapf {
    
	private double saldo = 200;
	
	public void mostrar_saldo_cliente() {
		System.out.println("Seu saldo é:" + this.saldo);
	}
	
	 public double depositar(double deposito) {
        return this.saldo += deposito;
	}
	 
	public double sacar(double sacar) {
		 return this.saldo -= sacar;
	}
	
}
