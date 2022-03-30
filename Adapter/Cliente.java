package Adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FactoryMethod.Filme;
import FactoryMethod.Locadora;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> listaObjetos = new ArrayList<Object>();
		List<String> nomeFilmes = new ArrayList<String>();
		 
		Scanner sc = new Scanner(System.in);
		LocadoraAdapter locadora = new LocadoraAdapter();
		String nome;
		int seletor;
		
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		while(seletor != 0) {
			if(seletor == 1) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeAcao filmeAcao = new FilmeAcao(nome);
				listaObjetos.add(filmeAcao);
				nomeFilmes.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 2) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeRomance filmeRomance = new FilmeRomance(nome);
				listaObjetos.add(filmeRomance);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 3) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeTerror filmeTerror = new FilmeTerror(nome);
				listaObjetos.add(filmeTerror);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 4) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeComedia filmeComedia = new FilmeComedia(nome);
				listaObjetos.add(filmeComedia);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 5) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeDocumentario filmeDocumentario = new FilmeDocumentario(nome);
				listaObjetos.add(filmeDocumentario);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 6) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeFiccaoCientifica filmeFiccaoCientifica = new FilmeFiccaoCientifica(nome);
				listaObjetos.add(filmeFiccaoCientifica);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("Filme(s) alugado(s): ");
		System.out.println();
		
		
		for(Object filme : listaObjetos) {
			System.out.println(filme + " foi alugado!");
		}
		
		System.out.println();
		System.out.println("Sessão finalizada, obrigado por confiar em nosso serviço!");
	
	}
}
