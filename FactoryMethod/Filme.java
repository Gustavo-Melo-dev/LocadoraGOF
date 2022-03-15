package FactoryMethod;

public class Filme implements Produto {
	
	private String nome;
	private int ano;
	private int classificacao;
	private float duracao;
	private float avaliacao;
	private String genero;
	private String direcao;
	private String sinopse;
	private boolean disponivel;
	private int tipoProduto = 1;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return "The Batman";
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

}





