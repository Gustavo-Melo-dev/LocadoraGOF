package Visitor;

public class FilmeDocumentario implements Filme {

	public String nome;
	
	public FilmeDocumentario(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}	
	
}