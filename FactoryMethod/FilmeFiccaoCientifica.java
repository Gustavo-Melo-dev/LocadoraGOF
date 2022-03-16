package FactoryMethod;

public class FilmeFiccaoCientifica implements Filme{

	@Override
	public String exibirInfo(String nome) {
		// TODO Auto-generated method stub
		return "Filme de " + nome;
	}

}
