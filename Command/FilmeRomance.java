package Command;

public class FilmeRomance implements Filme{
	
	public String nome;
	
	public FilmeRomance(String nome) {
		this.nome = nome;
	}

	@Override
	public String filme(String nome) {
		return "Filme de romance " + nome + " alugado!";
	}

	@Override
	public String toString() {
		return "Filme de romance " + nome + " alugado!";
	}
}