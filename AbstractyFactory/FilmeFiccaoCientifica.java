package AbstractyFactory;

public class FilmeFiccaoCientifica{
	
	public String nome;

	public FilmeFiccaoCientifica(String nome) {
		this.nome = nome;
	}

	public String filmeFiccaoCientifica(String nome) {
		return "Filme de ficção " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeFiccaoCientifica(nome);
	}
}
