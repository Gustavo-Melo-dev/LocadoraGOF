//
package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Prototype.FilmeAcao;
import Prototype.FilmeComedia;
import Prototype.FilmeDocumentario;
import Prototype.FilmeFiccaoCientifica;
import Prototype.FilmePrototype;
import Prototype.FilmeRomance;
import Prototype.FilmeTerror;

public class Cliente {

    public static void main(String[] args) {
                
    	Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		Locadora filmeLoc = Locadora.getInstancia();
		String nome;
		int seletor;
	    
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();
	    if(seletor == 1) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeTerror(nome));
		} else if(seletor == 2) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeAcao(nome));
		} else if(seletor == 3) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeDocumentario(nome));
		} else if(seletor == 4) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeRomance(nome));
		} else if(seletor == 5) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeFiccaoCientifica(nome));
		} else if(seletor == 6) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			listFilme.add(nome);
			System.out.println(filmeLoc.filmeComedia(nome));
		}
		
		sc.close();
    
	    filmeLoc.gerarRelatorio();
	    
	    System.out.println(Locadora.getInstancia().gerarRelatorio());
        
    }
    
}
