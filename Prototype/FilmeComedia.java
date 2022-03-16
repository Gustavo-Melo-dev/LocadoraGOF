package Prototype;

public class FilmeComedia extends FilmePrototype{

	protected FilmeComedia(FilmeComedia filmeComedia) {
		this.nomeFilme = filmeComedia.getNomeFilme();
	}
	
	public FilmeComedia() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de comédia: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeComedia clonar() {
		return new FilmeComedia(this);
	}
}
