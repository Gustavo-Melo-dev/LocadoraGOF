package AbstractyFactory;

public interface Locadora {

	FilmeTerror filmeTerror(String nome);
	FilmeAcao filmeAcao(String nome);
	FilmeComedia filmeComedia(String nome);
	FilmeDocumentario filmeDocumentario(String nome);
	FilmeFiccaoCientifica filmeFiccaoCientifica(String nome);
	FilmeRomance filmeRomance(String nome);
}
