package FactoryMethod;

public class FilmeAcao implements Filme {

	@Override
	public String exibirInfo(String nome) {
		return "Filme de a��o: " + nome;
	}
}
