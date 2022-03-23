package Visitor;

public class FilmeAcao implements Filme {

	public String nome;
	
	public FilmeAcao(String nome) {
		this.nome = nome;
	}

	@Override
	public String nome(String nome) {
		return "Filme de ação " + nome + " alugado!";
	}

}
