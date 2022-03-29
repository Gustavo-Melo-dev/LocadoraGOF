package TemplateMethod;

public class FilmeDocumentario extends Produtora {
	
	public String nome;
	
	public FilmeDocumentario(String nome) {
		this.nome = nome;
	}
	
	public String filmeDocumentario(String nome) {
		return "Filme de ação " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeDocumentario(nome);
	}

	@Override
	String exibirInfo() {
		return filmeDocumentario(nome);
	}
}
