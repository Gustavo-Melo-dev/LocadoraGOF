package Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Builder.FilmeAcaoBuilder;
import Builder.FilmeComediaBuilder;
import Builder.FilmeDocumentarioBuilder;
import Builder.FilmeFiccaoCientificaBuilder;
import Builder.FilmeProduto;
import Builder.FilmeRomanceBuilder;
import Builder.FilmeTerrorBuilder;
import Builder.Locadora;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
//	    
		System.out.print("Digite o c�digo do g�nero: ");
		seletor = sc.nextInt();
		
		while(seletor != 0) {
			if(seletor == 1) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeAcao filme = new FilmeAcao(nome);
				System.out.println("Filme de a��o " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			} else if(seletor == 2) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeComedia filme = new FilmeComedia(nome);
				System.out.println("Filme de com�dia " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			} else if(seletor == 3) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeRomance filme = new FilmeRomance(nome);
				System.out.println("Filme de romance " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			} else if(seletor == 4) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeFiccaoCientifica filme = new FilmeFiccaoCientifica(nome);
				System.out.println("Filme de fic��o " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			} else if(seletor == 5) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeDocumentario filme = new FilmeDocumentario(nome);
				System.out.println("Filme de document�rio " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			} else if(seletor == 6) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeTerror filme = new FilmeTerror(nome);
				System.out.println("Filme de terror " + nome + " alugado!");
				listFilme.add(nome);
				System.out.println();
				System.out.print("Digite o c�digo do g�nero: ");
				seletor = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("Filme(s) alugado(s): ");
		
		for(String filme : listFilme) {
			System.out.println(filme);
		}
		
		System.out.println();
		System.out.println("Sess�o finalizada, obrigado por confiar em nosso servi�o!");
		
	}

}
