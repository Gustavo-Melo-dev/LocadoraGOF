package TemplateMethod;

public class FilmeTerror extends Produtora {
	
	public String nome;
	
	public FilmeTerror(String nome) {
		this.nome = nome;
	}
	
	public String filmeTerror(String nome) {
		return "Filme de terror " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeTerror(nome);
	}
	
	@Override
	String exibirInfo() {
		return filmeTerror(nome);
	}

}
