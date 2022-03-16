package FactoryMethod;

public class FilmeComedia implements Filme {

	@Override
	public String exibirInfo(String nome) {
		// TODO Auto-generated method stub
		return "Filme de comédia: " + nome;
	}
	
}
