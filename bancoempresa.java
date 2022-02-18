
public class bancoempresa extends contapj{

	public String nome;
	private double cnpj;
	
	
	public double getCnpj() {
		return cnpj;
	}
	public void setCnpj(double cnpj) {
	   if(cnpj == 00000000000 ) {
		   System.out.println("erro");
	   }
		this.cnpj = cnpj;
	}
	
	
	
	
	
}
