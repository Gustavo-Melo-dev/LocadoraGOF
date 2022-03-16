package AbstractyFactoryLocadora;

public class Filme implements Locadora{

	@Override
	public FilmeTerror filmeTerror() {
		// TODO Auto-generated method stub
		return new FilmeTerror();
	}

	@Override
	public FilmeAcao filmeAcao() {
		// TODO Auto-generated method stub
		return new FilmeAcao();
	}

	@Override
	public FilmeComedia filmeComedia() {
		// TODO Auto-generated method stub
		return new FilmeComedia();
	}

	@Override
	public FilmeDocumentario filmeDocumentario() {
		// TODO Auto-generated method stub
		return new FilmeDocumentario();
	}

	@Override
	public FilmeFiccaoCientifica filmeFiccaoCientifica() {
		// TODO Auto-generated method stub
		return new FilmeFiccaoCientifica();
	}

	@Override
	public FilmeRomance filmeRomance() {
		// TODO Auto-generated method stub
		return new FilmeRomance();
	}
}
