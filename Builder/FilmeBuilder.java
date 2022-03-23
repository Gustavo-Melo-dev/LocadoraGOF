package Builder;

public abstract class FilmeBuilder {
	
	protected FilmeProduto filmeProduto = new FilmeProduto();
	
	public abstract void nome(String nome);
	
	public FilmeProduto getFilme(){
		return filmeProduto;
	};
}
