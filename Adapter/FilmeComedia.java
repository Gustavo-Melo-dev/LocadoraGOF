package Adapter;

public class FilmeComedia extends LocadoraAdapter{

	public FilmeComedia(String name) {
		super(name);
	}
	
	public String filmeComedia(){
		return "Filme de Com�dia";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme de Com�dia";
	}
}