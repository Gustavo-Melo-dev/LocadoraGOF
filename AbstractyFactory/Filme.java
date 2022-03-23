package AbstractyFactory;

public class Filme implements Locadora{
	
	@Override
	public FilmeTerror filmeTerror(String nome) {
		// TODO Auto-generated method stub
		return new FilmeTerror(nome);
	}

	@Override
	public FilmeAcao filmeAcao(String nome) {
		// TODO Auto-generated method stub
		return new FilmeAcao(nome);
	}

	@Override
	public FilmeComedia filmeComedia(String nome) {
		// TODO Auto-generated method stub
		return new FilmeComedia(nome);
	}

	@Override
	public FilmeDocumentario filmeDocumentario(String nome) {
		// TODO Auto-generated method stub
		return new FilmeDocumentario(nome);
	}

	@Override
	public FilmeFiccaoCientifica filmeFiccaoCientifica(String nome) {
		// TODO Auto-generated method stub
		return new FilmeFiccaoCientifica(nome);
	}

	@Override
	public FilmeRomance filmeRomance(String nome) {
		// TODO Auto-generated method stub
		return new FilmeRomance(nome);
	}
}
