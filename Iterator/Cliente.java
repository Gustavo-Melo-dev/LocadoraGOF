package Iterator;

public class Cliente{

	public static void main(String args []) {
		
		Filme [] filme = new Filme[4];

		filme[0] = new Filme("Filme 1");
		filme[1] = new Filme("Filme 2");
		filme[2] = new Filme("Filme 3");
		filme[3] = new Filme("Filme 4");

		// for (int i=0; i < filme.length; i++) {
		// 	System.out.println(filme[i].nome);
		// }

		Locadora LocadoraIterator = new LocadoraIterator(filme);

		while (locadoraIterator.hasNext()) {
			Filme filme = (Filme)locadoraIterator.next();
			System.out.println(filme.nome);
		}

	}
}