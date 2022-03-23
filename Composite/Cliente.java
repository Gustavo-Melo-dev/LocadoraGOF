package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locadora filmeLoc = new Locadora();
				
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
	    
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		if(seletor == 1) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteAcao = filmeLoc.filmeAcao(nome);
			listFilme.add(nome);
			System.out.println(clienteAcao);
		} else if(seletor == 2) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteComedia = filmeLoc.filmeAcao(nome);
			listFilme.add(nome);
			System.out.println(clienteComedia);
		} else if(seletor == 3) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteDocumentario = filmeLoc.filmeDocumentario(nome);
			listFilme.add(nome);
			System.out.println(clienteDocumentario);
		} else if(seletor == 4) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteFiccao = filmeLoc.filmeFiccaoCientifica(nome);
			listFilme.add(nome);
			System.out.println(clienteFiccao);
		} else if(seletor == 5) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteRomance = filmeLoc.filmeRomance(nome);
			listFilme.add(nome);
			System.out.println(clienteRomance);
		} else if(seletor == 6) {
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			String clienteTerror = filmeLoc.filmeTerror(nome);
			listFilme.add(nome);
			System.out.println(clienteTerror);
		}
		
		sc.close();
		
	}

}
