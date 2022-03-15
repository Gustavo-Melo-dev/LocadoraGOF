package FactoryMethod;

public class Game implements Produto {
	
	private String nome;
	private int tipoProduto = 2;
	
	
	public String getNome() {
		return "Elden Ring";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipoProduto() {
		return tipoProduto;
	}

	
}
