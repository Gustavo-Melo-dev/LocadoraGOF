package Command;

public class FilmeDocumentario implements Filme{
	
	public String nome;
	
	public FilmeDocumentario(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de documentário " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de documentário " + nome + " alugado!";
	}
}