package AbstractyFactory;

public class FilmeAcao {
	
	public String nome;

	public FilmeAcao(String nome) {
		this.nome = nome;
	}

	public String filmeAcao(String nome) {
		return "Filme de a��o " + nome + " alugado!";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmeAcao(nome);
	}
}
