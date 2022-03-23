package Composite;

public class Locadora implements FilmeComponentes{
	
	public String nome;

	@Override
	public String filmeTerror(String nome) {
	return "Filme de terror " + nome + " alugado!";
	}

	@Override
	public String filmeAcao(String nome) {
	return "Filme de ação " + nome + " alugado!";
	}

	@Override
	public String filmeComedia(String nome) {
	return "Filme de comédia " + nome + " alugado!";
	}

	@Override
	public String filmeDocumentario(String nome) {
	return "Filme de documentário " + nome + " alugado!";
	}

	@Override
	public String filmeFiccaoCientifica(String nome) {
	return "Filme de ficção " + nome + " alugado!";
	}

	@Override
	public String filmeRomance(String nome) {
	return "Filme de romance " + nome + " alugado!";
    }
}