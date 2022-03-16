package FactoryMethod;

public class FilmeTerror implements Filme {

	@Override
	public String exibirInfo(String nome) {
		// TODO Auto-generated method stub
		return "Filme de terror" + nome;
	}

}
