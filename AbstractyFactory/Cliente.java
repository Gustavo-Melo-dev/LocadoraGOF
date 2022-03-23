package AbstractyFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Filme filmeLoc = new Filme();
		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
	    
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		if(seletor == 1) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeAcao clienteAcao = filmeLoc.filmeAcao(nome);
			listFilme.add(nome);
			System.out.println(clienteAcao);
		} else if(seletor == 2) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeComedia clienteComedia = filmeLoc.filmeComedia(nome);
			listFilme.add(nome);
			System.out.println(clienteComedia);
		} else if(seletor == 3) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeDocumentario clienteDocumentario = filmeLoc.filmeDocumentario(nome);
			listFilme.add(nome);
			System.out.println(clienteDocumentario);
		} else if(seletor == 4) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeFiccaoCientifica clienteFiccao = filmeLoc.filmeFiccaoCientifica(nome);
			listFilme.add(nome);
			System.out.println(clienteFiccao);
		} else if(seletor == 5) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeRomance clienteRomance = filmeLoc.filmeRomance(nome);
			listFilme.add(nome);
			System.out.println(clienteRomance);
		} else if(seletor == 6) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			FilmeTerror clienteTerror = filmeLoc.filmeTerror(nome);
			listFilme.add(nome);
			System.out.println(clienteTerror);
		}
		
		sc.close();		
	}

}
