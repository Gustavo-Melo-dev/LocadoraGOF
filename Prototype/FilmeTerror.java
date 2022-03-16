package PrototypeLocadora;

public class FilmeTerror extends FilmePrototype {
	
	protected FilmeTerror(FilmeTerror filmeTerror) {
		this.nomeFilme = filmeTerror.getNomeFilme();
	}
	
	public FilmeTerror() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de terror: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeTerror clonar() {
		return new FilmeTerror(this);
	}

}
