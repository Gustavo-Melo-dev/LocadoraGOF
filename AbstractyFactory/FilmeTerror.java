package AbstractyFactory;

public class FilmeTerror{
	
	public String nome;

	public FilmeTerror(String nome) {
		this.nome = nome;
	}

	public String filmeTerror(String nome) {
		return "Filme de terror " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeTerror(nome);
	}
}
