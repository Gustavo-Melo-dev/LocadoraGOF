package AbstractyFactory;

public class FilmeRomance{
	
	public String nome;

	public FilmeRomance(String nome) {
		this.nome = nome;
	}

	public String filmeRomance(String nome) {
		return "Filme de romance " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeRomance(nome);
	}
}
