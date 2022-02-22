import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Bancoempresa pj = new Bancoempresa();
		
		Bancopf pessoaf = new Bancopf();

		
		int  decisao, cliente, gerenciar, cadastro;
		 
		System.out.println("[1] acessar banco [2] para fazer cadastro ");
		
		 decisao = input.nextInt();
		 
		if(decisao == 1) {
	         System.out.println("Pessoa Fisica[1] Empresa[2] ");
	         
	         	cliente = input.nextInt();
	         	
	    if(cliente == 1) {
	    	
	       System.out.print("Sacar [1] Depositar [2] Saldo [3]");
	       
	          gerenciar = input.nextInt();
	          
	      switch(gerenciar) {
	        	
	             case 1: 
	        		  System.out.println("Digete o valor a ser sacado"); 
	        		  pessoaf.sacar(input.nextDouble());
	        	      pessoaf.mostrar_saldo_cliente();
	        	      
	        	 case 2:
	        		  System.out.println("Digete o valor a ser depositado"); 
		        	  pessoaf.depositar(input.nextDouble());
		        	  pessoaf.mostrar_saldo_cliente();
		        	  
	        	 case 3:
	        		 
	        		 pessoaf.mostrar_saldo_cliente();
	        		 
	    }
	  }
	  if(cliente == 2) {
		  
	     System.out.print("Sacar [1] Depositar [2] Saldo [3]");
	     
	        	   gerenciar = input.nextInt();
	       switch(gerenciar) {
	        
	             case 1: 
	        		  System.out.println("Digete o valor a ser sacado"); 
	        		  pj.sacar(input.nextDouble());
	        	      pj.mostrar_saldo_cliente();
	        	      
	        	 case 2:
	        		   System.out.println("Digete o valor a ser depositado"); 
		        	   pj.depositar(input.nextDouble());
		        	   pj.mostrar_saldo_cliente();
		        	   
	        	 case 3:
	        		 pj.mostrar_saldo_cliente();
	        
	       }		
 	      }
        }  
		    
		   
		   if(decisao ==2) {
			    System.out.println("1 para pessoa fisica 2 para empresa");
			     cadastro = input.nextInt();
			  if(cadastro == 1){
				  System.out.println("Dite  o nome do Cliente");
				   
				    pessoaf.setNome(input.next());
				    
				  System.out.println("Dite  o cpf do cliente");
				  
				    pessoaf.setCpf(input.next());
				 
				  System.out.println("Digite  a data de aniversario do cliente");
			 	   
				    pessoaf.setNascimento(input.next());
				    
				  System.out.println("Cadastro feito com Sucesso!" + "Nome = " + 
	                   pessoaf.getNome() + "Data de nascimento" + pessoaf.getNascimento() +
                       "Seu Cpf: "  + pessoaf.getCpf());   
	      }
			  if(cadastro == 2) {
				  System.out.println("Dite  o nome da Empresa");
				   
				    pj.setNome(input.next());
				    
				  System.out.println("Dite  o cnpj do cliente");
				  
				    pj.setCnpj(input.next());;
				 
					    
				  System.out.println("Cadastro feito com Sucesso!" + "Nome = " + " " +
	                   pj.getNome() +
                     "Seu Cpf: "  + pj.getCnpj()); 
				  
	        }	  
	     }
	  }
	}

