package aplicacao;
import java.util.Scanner; 

public class programa {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		Produtos produtos = new Produtos(); 
		double notas = 0; 
		double media= 0; 
		
		// T�tulo modificar dps, pois n�o coloquei o inicio em mai�sculo 
	
	
		// Identifcando o nome do aluno
		System.out.println("Informe o nome do aluno:");
		produtos.nomeAluno = leitura.next();
		
		
		// Fazendo a leitura das notas
		System.out.println("Informe as notas do aluno em quest�o:");
		
		for(int i=0; i<produtos.contador; i++) {
		produtos.notas= leitura.nextDouble();
		produtos.somaNotas(notas); 
		}
		
		media = produtos.contador;
		
		
		System.out.println("Nome do aluno:" + produtos.nomeAluno); 
		
		for(int i=0; i<2; i++) {
			System.out.println("Notas:");
			System.out.println(notas);
			}
		
		System.out.println("M�dia:" + produtos.media); 
		
		
		 leitura.close(); 
		
	}

}
 