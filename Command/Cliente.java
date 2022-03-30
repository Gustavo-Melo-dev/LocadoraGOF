package Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
		
		System.out.print("Digite o código de gênero: ");
		seletor = sc.nextInt();
		
		while(seletor != 0) {
			if(seletor == 1) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeAcao(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 2) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeRomance(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 3) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeTerror(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 4) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeComedia(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 5) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeFiccaoCientifica(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 6) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				Filme filme = new FilmeDocumentario(nome);
				System.out.println(filme.toString());
				listFilme.add(nome);
				System.out.print("Digite o código de gênero: ");
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
		System.out.println("Sessão finalizada, obrigado por confiar em nosso serviço!");
	}

}
