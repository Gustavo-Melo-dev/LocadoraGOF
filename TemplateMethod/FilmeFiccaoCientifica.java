package TemplateMethod;

public class FilmeFiccaoCientifica extends Produtora {
	
	public String nome;
	
	public FilmeFiccaoCientifica(String nome) {
		this.nome = nome;
	}
	
	public String filmeFiccaoCientifica(String nome) {
		return "Filme de a��o " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		return filmeFiccaoCientifica(nome);
	}

	@Override
	String exibirInfo() {
		return filmeFiccaoCientifica(nome);
	}

}
