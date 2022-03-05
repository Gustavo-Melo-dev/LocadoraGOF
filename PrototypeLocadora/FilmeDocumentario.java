package PrototypeLocadora;

public class FilmeDocumentario extends FilmePrototype {
	
	protected FilmeDocumentario(FilmeDocumentario filmeDocumentario) {
		this.nomeFilme = filmeDocumentario.getNomeFilme();
	}
	
	public FilmeDocumentario() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de documentário: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeDocumentario clonar() {
		return new FilmeDocumentario(this);
	}
}
