package Command;

public class FilmeTerror implements Filme{
	
	public String nome;
	
	public FilmeTerror(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de terror " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de terror " + nome + " alugado!";
	}
}