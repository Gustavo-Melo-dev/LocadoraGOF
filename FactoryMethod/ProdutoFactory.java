package FactoryMethod;

public class ProdutoFactory {
	public static Produto createProduto(int tipoProduto) {
		if (tipoProduto == 1) {
			return new Filme();
		}
		else if (tipoProduto == 2) {
			return new Game();
		}
		return null;
	}

}
