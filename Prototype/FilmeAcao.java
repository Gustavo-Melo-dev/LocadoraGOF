package Prototype;

public class FilmeAcao extends FilmePrototype{
	
	protected FilmeAcao(FilmeAcao filmeAcao) {
		this.nomeFilme = filmeAcao.getNomeFilme();
	}
	
	public FilmeAcao() {
		nomeFilme = null;
	}
	
	@Override
	public String exibirInfo() {
		return "Filme de ação: " + getNomeFilme() + "\n";
	}
	
	@Override
	public FilmeAcao clonar() {
		return new FilmeAcao(this);
	}
}
