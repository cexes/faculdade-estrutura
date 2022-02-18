public class bancopf  extends contapf{

	public String nome;
    private  double nascimento;
    private double cpf;
  
    
    
    public void  set_cpf(double cpf) {
    	if(cpf == 00000000000) {
    		System.out.println("ERRO");}
    	this.cpf = cpf;
    }
    public double get_cpf(){
    	  return this.cpf;
    }
     
    public void set_nascimento(double aniversario) {
    	if(aniversario == 00000000) {
    		System.out.println("ERRO, data de aniversario inserida incorretamente");
    	} this.nascimento = aniversario;
    }

}
	

