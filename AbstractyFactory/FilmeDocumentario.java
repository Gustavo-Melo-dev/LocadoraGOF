package AbstractyFactory;

public class FilmeDocumentario{
	
	public String nome;

	public FilmeDocumentario(String nome) {
		this.nome = nome;
	}

	public String filmeDocumentario(String nome) {
		return "Filme de documentário " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeDocumentario(nome);
	}
}
