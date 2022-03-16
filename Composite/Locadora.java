package Composite;

public class Locadora implements FilmeComponentes{

    @Override
	public FilmeTerror filmeTerror() {
	return new FilmeTerror();
	}

	@Override
	public FilmeAcao filmeAcao() {
	return new FilmeAcao();
	}

	@Override
	public FilmeComedia filmeComedia() {
	return new FilmeComedia();
	}

	@Override
	public FilmeDocumentario filmeDocumentario() {
	return new FilmeDocumentario();
	}

	@Override
	public FilmeFiccaoCientifica filmeFiccaoCientifica() {
	return new FilmeFiccaoCientifica();
	}

	@Override
	public FilmeRomance filmeRomance() {
	return new FilmeRomance();
    }
}