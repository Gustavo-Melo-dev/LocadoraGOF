package AbstractyFactory;

public class FilmeComedia{
	
	public String nome;

	public FilmeComedia(String nome) {
		this.nome = nome;
	}

	public String filmeComedia(String nome) {
		return "Filme de comédia " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeComedia(nome);
	}
}
