package Bridge;

public class Cliente {

	public static void main(String[] args) {
		
		LocadoraBridge locadora = new LocadoraBridge();
		
		locadora.aberta();
		
		System.out.println(locadora.aberta());
		
		FilmeBridge filme = new FilmeBridge("E aí vei!");
		
		filme.filmeAcao();
		
		System.out.println(filme.filmeAcao());
		
		FilmeBridge comedia = new FilmeBridge("The Grandfather");
		
		comedia.filmeComedia();
		
		System.out.println(comedia.filmeComedia());

	}

}
