package Adapter;

public class FilmeDocumentario extends LocadoraAdapter{

	public FilmeDocumentario(String name) {
		super(name);
	}
	
	public String filmeDocumentario(){
		return "Filme de documentário";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme " + name;
	}
}