// vai lidar apenas com a class ConcessionariaDirector, 
// toda a estrutura e algoritmos utilizados para construir o carro 

package Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
                
    	
    	
		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
	    
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		if(seletor == 1) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeAcaoBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		} else if(seletor == 2) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeComediaBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		} else if(seletor == 3) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeDocumentarioBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		} else if(seletor == 4) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeFiccaoCientificaBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		} else if(seletor == 5) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeRomanceBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		} else if(seletor == 6) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			Locadora locadora = new Locadora(new FilmeTerrorBuilder(), nome);
	    	locadora.construirFilme();
	    	FilmeProduto filme = locadora.getFilme();
	    	System.out.println(filme.nome);
			listFilme.add(nome);
		}
		
		sc.close();		
    }
    
}
