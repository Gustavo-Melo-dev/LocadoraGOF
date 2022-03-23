package Builder;

public class FilmeRomanceBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de romance " + nome + " alugado!";
	}
}