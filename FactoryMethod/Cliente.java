package FactoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        // TODO code application logic here
		
    	Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		Locadora locadora = new Locadora();
		String nome;
		int seletor;
		
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		while(seletor != 0) {
			if(seletor == 1) {
				Filme filmeAcao = locadora.criarFilmeAcao();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeAcao.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 2) {
				Filme filmeComedia = locadora.criarFilmeComedia();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeComedia.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 3) {
				Filme filmeRomance = locadora.criarFilmeRomance();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeRomance.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 4) {
				Filme filmeTerror = locadora.criarFilmeTerror();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeTerror.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 5) {
				Filme filmeDocumentario = locadora.criarFilmeDocumentario();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeDocumentario.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
				seletor = sc.nextInt();
			} else if(seletor == 6) {
				Filme filmeFiccaoCientifica = locadora.criarFilmeFiccaoCientifica();
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				System.out.println(filmeFiccaoCientifica.exibirInfo(nome));
				listFilme.add(nome);
				System.out.print("Digite o código do gênero: ");
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
