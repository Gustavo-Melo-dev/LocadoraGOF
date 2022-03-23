package Visitor;

public class FilmeFiccaoCientifica implements Filme {

	public String nome;
	
	public FilmeFiccaoCientifica(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}	
	
}