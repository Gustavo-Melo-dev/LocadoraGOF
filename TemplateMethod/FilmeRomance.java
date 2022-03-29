package TemplateMethod;

public class FilmeRomance extends Produtora {
	
	public String nome;
	
	public FilmeRomance(String nome) {
		this.nome = nome;
	}
	
	public String filmeRomance(String nome) {
		return "Filme de ação " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeRomance(nome);
	}

	@Override
	String exibirInfo() {
		return filmeRomance(nome);
	}
}
