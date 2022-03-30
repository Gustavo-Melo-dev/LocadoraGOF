package Bridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Adapter.FilmeAcao;
import Adapter.FilmeComedia;
import Adapter.FilmeDocumentario;
import Adapter.FilmeFiccaoCientifica;
import Adapter.FilmeRomance;
import Adapter.FilmeTerror;

public class Cliente {

	public static void main(String[] args) {
		
		LocadoraBridge locadora = new LocadoraBridge();
		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		
		int openClose, seletor;
		String nome;
		
		// 0 - Fechada
		// 1 - Aberta
		System.out.print("Digite o valor OPEN/CLOSE: ");
		openClose = sc.nextInt();
		
		if(openClose == 1) {
			System.out.println(locadora.aberta()); 
			System.out.print("Digite o valor correspondente ao gênero: ");
			seletor = sc.nextInt();
			while(seletor != 0) {
				if(seletor == 1) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeAcao = new FilmeBridge(nome);
					System.out.println(filmeAcao.filmeAcao());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				} else if(seletor == 2) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeRomance = new FilmeBridge(nome);
					System.out.println(filmeRomance.filmeRomance());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				} else if(seletor == 3) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeTerror = new FilmeBridge(nome);
					System.out.println(filmeTerror.filmeTerror());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				} else if(seletor == 4) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeComedia = new FilmeBridge(nome);
					System.out.println(filmeComedia.filmeComedia());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				} else if(seletor == 5) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeDocumentario = new FilmeBridge(nome);
					System.out.println(filmeDocumentario.filmeDocumentario());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				} else if(seletor == 6) {
					System.out.print("Digite o nome do filme: ");
					nome = sc.next();
					FilmeBridge filmeFiccaoCientifica = new FilmeBridge(nome);
					System.out.println(filmeFiccaoCientifica.filmeFiccaoCientifica());
					listFilme.add(nome);
					System.out.print("Digite o valor correspondente ao gênero: ");
					seletor = sc.nextInt();
				}
			}
		} else {
			System.out.println(locadora.fechada());
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
