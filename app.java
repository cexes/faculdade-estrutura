import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		bancoempresa pj = new bancoempresa();
		bancopf pessoaf = new bancopf();
		int decisao;
		int cliente;
		int gerenciar;
		System.out.println("[1] acessar banco [2] para fazer cadastro ");
		 decisao = input.nextInt();;
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
	         } if(cliente == 2) {
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
	}}


