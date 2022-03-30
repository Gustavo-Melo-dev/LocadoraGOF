package Command;

public class FilmeAcao implements Filme{
	
	public String nome;
	
	public FilmeAcao(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de ação " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de ação " + nome + " alugado!";
	}
}
