package Builder;

public class FilmeDocumentarioBuilder extends FilmeBuilder {
	
	@Override
	public void nome(String nome) {
		filmeProduto.nome = "Filme de document�rio " + nome + " alugado!";
	}
}