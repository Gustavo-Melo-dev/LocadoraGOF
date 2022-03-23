package Builder;

public class FilmeFiccaoCientificaBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de ficção " + nome + " alugado!";
	}
}