package Builder;

public class FilmeTerrorBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de terror " + nome + " alugado!";
	}
}
