package TemplateMethod;

public class FilmeComedia extends Produtora {
	
	public String nome;
	
	public FilmeComedia (String nome) {
		this.nome = nome;
	}
	
	public String filmeComedia(String nome) {
		return "Filme de a��o " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeComedia(nome);
	}

	@Override
	String exibirInfo() {
		return filmeComedia(nome);
	}
}
