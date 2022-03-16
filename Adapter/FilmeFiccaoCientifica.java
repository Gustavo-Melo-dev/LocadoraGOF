package Adapter;

public class FilmeFiccaoCientifica extends LocadoraAdapter{

	public FilmeFiccaoCientifica(String name) {
		super(name);
	}
	
	public String filmeFiccaoCientifica(){
		return "Filme de Ficção Científica";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme " + name;
	}
}