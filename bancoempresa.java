public class Bancoempresa extends Contapj{

	private String nome;
	private String cnpj;
	
	Bancoempresa(){
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
   public String getCnpj() {
		return cnpj;
	}
    
    public void setCnpj(String cnpj) {
	    this.cnpj = cnpj;
	
    }
	
    public String getNome() {
    	return this.nome;
    }
	
    public void setNome(String nome) {
    	 
    	this.nome = nome;
    }
	
	
}
