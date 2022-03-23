package Composite;

public class Locadora implements FilmeComponentes{
	
	public String nome;

	@Override
	public String filmeTerror(String nome) {
	return "Filme de terror " + nome + " alugado!";
	}

	@Override
	public String filmeAcao(String nome) {
	return "Filme de a��o " + nome + " alugado!";
	}

	@Override
	public String filmeComedia(String nome) {
	return "Filme de com�dia " + nome + " alugado!";
	}

	@Override
	public String filmeDocumentario(String nome) {
	return "Filme de document�rio " + nome + " alugado!";
	}

	@Override
	public String filmeFiccaoCientifica(String nome) {
	return "Filme de fic��o " + nome + " alugado!";
	}

	@Override
	public String filmeRomance(String nome) {
	return "Filme de romance " + nome + " alugado!";
    }
}