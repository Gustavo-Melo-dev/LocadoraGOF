package Adapter;

public class FilmeTerror extends LocadoraAdapter{

	public FilmeTerror(String name) {
		super(name);
	}
	
	public String filmeTerror(){
		return "Filme de Terror";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme " + name;
	}
}