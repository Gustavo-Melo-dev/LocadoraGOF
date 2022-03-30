package Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FactoryMethod.Filme;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		
		String nome;
		int seletor;
		
		System.out.print("Digite o c�digo do g�nero: ");
		seletor = sc.nextInt();

		while(seletor != 0) {
			if(seletor == 1) {
				FilmeAcao filmeLocAcao = new FilmeAcao();
				FilmePrototype clienteAcao = filmeLocAcao.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteAcao.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteAcao.exibirInfo());
			} else if(seletor == 2) {
				FilmeComedia filmeLocComedia = new FilmeComedia();
				FilmePrototype clienteComedia = filmeLocComedia.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteComedia.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteComedia.exibirInfo());
			} else if(seletor == 3) {
				FilmeDocumentario filmeLocDocumentario = new FilmeDocumentario();
				FilmeDocumentario clienteDocumentario = filmeLocDocumentario.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteDocumentario.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteDocumentario.exibirInfo());
			} else if(seletor == 4) {
				FilmeTerror filmeLocTerror = new FilmeTerror();
				FilmeTerror clienteTerror = filmeLocTerror.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteTerror.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteTerror.exibirInfo());
			} else if(seletor == 5) {
				FilmeRomance filmeLocRomance = new FilmeRomance();
				FilmeRomance clienteRomance = filmeLocRomance.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteRomance.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteRomance.exibirInfo());
			} else if(seletor == 6) {
				FilmeFiccaoCientifica filmeLocFiccaoCientifica = new FilmeFiccaoCientifica();
				FilmeFiccaoCientifica clienteFiccaoCientifica = filmeLocFiccaoCientifica.clonar();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				clienteFiccaoCientifica.setNomeFilme(nome);
				listFilme.add(nome);
				System.out.println(clienteFiccaoCientifica.exibirInfo());
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
