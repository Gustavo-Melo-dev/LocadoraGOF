package FactoryMethod;

public class FilmeRomance implements Filme {

	@Override
	public String exibirInfo(String nome) {
		return "Filme de " + nome;
	}

}
