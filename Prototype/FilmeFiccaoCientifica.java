package Prototype;

public class FilmeFiccaoCientifica extends FilmePrototype {

	protected FilmeFiccaoCientifica(FilmeFiccaoCientifica filmeFiccaoCientifica) {
		this.nomeFilme = filmeFiccaoCientifica.getNomeFilme();
	}
	
	public FilmeFiccaoCientifica() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de ficção científica: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeFiccaoCientifica clonar() {
		return new FilmeFiccaoCientifica(this);
	}
}
