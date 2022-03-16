package Adapter;

public class FilmeRomance extends LocadoraAdapter{

	public FilmeRomance(String name) {
		super(name);
	}
	
	public String filmeRomance(){
		return "Filme de romance";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme " + name;
	}
}
