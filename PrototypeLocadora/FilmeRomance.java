package PrototypeLocadora;

public class FilmeRomance extends FilmePrototype {

	protected FilmeRomance(FilmeRomance filmeRomance) {
		this.nomeFilme = filmeRomance.getNomeFilme();
	}
	
	public FilmeRomance() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de romance: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeRomance clonar() {
		return new FilmeRomance(this);
	}
}
