package FactoryMethod;

public class Main {
	
	public static void main(String[] args) {
		Produto filme = ProdutoFactory.createProduto(1);
		Produto game = ProdutoFactory.createProduto(2);
				
		System.out.println(filme.getNome());
		System.out.println(game.getNome());
	}

}
