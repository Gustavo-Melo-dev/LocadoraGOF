package Builder;

public class FilmeComediaBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de com�dia " + nome + " alugado!";
	}
}