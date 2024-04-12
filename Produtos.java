package aplicacao;

public class Produtos {
	
	public String nomeAluno; 
	public int contador = 2; 
	public Double notas; 
	public Double media;
	public int somaNotas;
	
	public void somaNotas (double notas) {
		this.notas += notas; 
	}
	
	public void mediaFinal (double media, double somaNotas) {
		this.media = somaNotas / contador; 
	}
	
}
