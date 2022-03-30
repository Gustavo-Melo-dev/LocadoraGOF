package Command;

public class FilmeFiccaoCientifica implements Filme{
	
	public String nome;
	
	public FilmeFiccaoCientifica(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de fic��o " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de fic��o " + nome + " alugado!";
	}
}