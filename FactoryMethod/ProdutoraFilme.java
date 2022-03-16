package FactoryMethod;

public interface ProdutoraFilme {

	Filme criarFilmeAcao();
	Filme criarFilmeRomance();
	Filme criarFilmeComedia();
	Filme criarFilmeTerror();
	Filme criarFilmeDocumentario();
	Filme criarFilmeFiccaoCientifica();
}
