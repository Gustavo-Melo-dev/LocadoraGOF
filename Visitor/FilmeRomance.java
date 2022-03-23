package Visitor;

public class FilmeRomance implements Filme {

	public String nome;
	
	public FilmeRomance(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}	
	
}