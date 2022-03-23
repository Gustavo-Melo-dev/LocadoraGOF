package Visitor;

public class FilmeComedia implements Filme {

	public String nome;
	
	public FilmeComedia(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}
	
}
