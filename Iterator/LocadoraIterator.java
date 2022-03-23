package Iterator;

public class LocadoraIterator implements Locadora {

	Filme[] itens;
	int posicao = 0;

	public LocadoraIterator(Filme[] itens) {
		this.itens = itens;
	}

	public Object next() {
		Filme filme = itens[posicao];
		posicao++;
		return filme;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}

}