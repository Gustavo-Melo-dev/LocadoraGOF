package Visitor;

public class FilmeTerror implements Filme {

	public String nome;
	
	public FilmeTerror(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}	
	
}