package TemplateMethod;

public class FilmeAcao extends Produtora {	
	
	public String nome;
	
	public FilmeAcao(String nome) {
		this.nome = nome;
	}
	
	public String filmeAcao(String nome) {
		return "Filme de ação " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeAcao(nome);
	}

	@Override
	String exibirInfo() {
		return filmeAcao(nome);
	}
}
