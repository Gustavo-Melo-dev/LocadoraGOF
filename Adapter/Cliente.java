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

		if(seletor == 1) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeAcao filmeAcao = new FilmeAcao(nome);
			listaObjetos.add(filmeAcao);
			nomeFilmes.add(nome);
		} else if(seletor == 2) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeRomance filmeRomance = new FilmeRomance(nome);
			listaObjetos.add(filmeRomance);
		} else if(seletor == 3) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeTerror filmeTerror = new FilmeTerror(nome);
			listaObjetos.add(filmeTerror);
		} else if(seletor == 4) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeComedia filmeComedia = new FilmeComedia(nome);
			listaObjetos.add(filmeComedia);
		} else if(seletor == 5) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeDocumentario filmeDocumentario = new FilmeDocumentario(nome);
			listaObjetos.add(filmeDocumentario);
		} else if(seletor == 6) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeFiccaoCientifica filmeFiccaoCientifica = new FilmeFiccaoCientifica(nome);
			listaObjetos.add(filmeFiccaoCientifica);
		}
		
		
		for(Object filme : listaObjetos) {
			System.out.println(filme + " foi alugado!");
		}
		
		sc.close();
	
	}
}
