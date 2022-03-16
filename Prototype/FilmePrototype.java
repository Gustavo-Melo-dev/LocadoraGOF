package PrototypeLocadora;

public abstract class FilmePrototype {

	protected String nomeFilme;
	
	public abstract String exibirInfo();
	
	public abstract FilmePrototype clonar();

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
}
