package FactoryMethod;

public class Locadora implements ProdutoraFilme {

	@Override
	public Filme criarFilmeAcao() {
		// TODO Auto-generated method stub
		return new FilmeAcao();
	}

	@Override
	public Filme criarFilmeRomance() {
		// TODO Auto-generated method stub
		return new FilmeRomance();
	}

	@Override
	public Filme criarFilmeComedia() {
		// TODO Auto-generated method stub
		return new FilmeComedia();
	}

	@Override
	public Filme criarFilmeTerror() {
		// TODO Auto-generated method stub
		return new FilmeTerror();
	}

	@Override
	public Filme criarFilmeDocumentario() {
		// TODO Auto-generated method stub
		return new FilmeDocumentario();
	}

	@Override
	public Filme criarFilmeFiccaoCientifica() {
		// TODO Auto-generated method stub
		return new FilmeFiccaoCientifica();
	}
}
