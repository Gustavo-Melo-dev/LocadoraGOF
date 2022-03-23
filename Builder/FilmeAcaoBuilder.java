package Builder;

public class FilmeAcaoBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de ação " + nome + " alugado!";
	}
}
