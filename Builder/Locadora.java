package Builder;

public class Locadora {

	 protected FilmeBuilder locadora;
	 public String nome;
	 
	 public Locadora(FilmeBuilder locadora, String nome) {
        this.locadora = locadora;
        this.nome = nome;
	 }

	public void construirFilme() {
		 locadora.nome(nome);
    }
	 
	 public FilmeProduto getFilme() {
        return locadora.getFilme();
    }
}
