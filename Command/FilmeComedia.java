package Command;

public class FilmeComedia implements Filme{
	
	public String nome;
	
	public FilmeComedia(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de com�dia " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de com�dia " + nome + " alugado!";
	}
}