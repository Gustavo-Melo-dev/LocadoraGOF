package Bridge;

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
			if(seletor == 1) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeAcao = new FilmeBridge(nome);
				System.out.println(filmeAcao.filmeAcao());
			} else if(seletor == 2) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeRomance = new FilmeBridge(nome);
				System.out.println(filmeRomance.filmeRomance());
			} else if(seletor == 3) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeTerror = new FilmeBridge(nome);
				System.out.println(filmeTerror.filmeTerror());
			} else if(seletor == 4) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeComedia = new FilmeBridge(nome);
				System.out.println(filmeComedia.filmeComedia());
			} else if(seletor == 5) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeDocumentario = new FilmeBridge(nome);
				System.out.println(filmeDocumentario.filmeDocumentario());
			} else if(seletor == 6) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeBridge filmeFiccaoCientifica = new FilmeBridge(nome);
				System.out.println(filmeFiccaoCientifica.filmeFiccaoCientifica());
			}
		} else {
			System.out.println(locadora.fechada());
		}
	}
}
