import java.util.Date;
import java.text.SimpleDateFormat;
public class Bancopf  extends Contapf{

	Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
	String niver = formatar.format(data);
   
	private String nome;
        private String  nascimento;
        private String cpf;

    
    Bancopf(){
    	this.nome = nome;
    	this.nascimento = niver;
    	this.cpf = cpf;
    	
    }
    
    public String getNascimento(){
    	return this.nascimento;
    }
    
    public void setNascimento(String nascimento) {
         this.nascimento = nascimento;     	
    }
      
    public String getCpf() {
    	return this.cpf;
    }
   
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

