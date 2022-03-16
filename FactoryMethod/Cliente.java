package FactoryMethod;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        // TODO code application logic here
		
    	Scanner sc = new Scanner(System.in);
		Locadora locadora = new Locadora();
		String nome;
		int seletor;
		
		System.out.print("Digite o código do gênero: ");
		seletor = sc.nextInt();

		if(seletor == 1) {
			Filme filmeAcao = locadora.criarFilmeAcao();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeAcao.exibirInfo(nome));
		} else if(seletor == 2) {
			Filme filmeComedia = locadora.criarFilmeComedia();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeComedia.exibirInfo(nome));
		} else if(seletor == 3) {
			Filme filmeRomance = locadora.criarFilmeRomance();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeRomance.exibirInfo(nome));
		} else if(seletor == 4) {
			Filme filmeTerror = locadora.criarFilmeTerror();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeTerror.exibirInfo(nome));
		} else if(seletor == 5) {
			Filme filmeDocumentario = locadora.criarFilmeDocumentario();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeDocumentario.exibirInfo(nome));
		} else if(seletor == 6) {
			Filme filmeFiccaoCientifica = locadora.criarFilmeFiccaoCientifica();
			System.out.print("Digite o nome do filme: ");
			nome = sc.next();
			System.out.println(filmeFiccaoCientifica.exibirInfo(nome));
		}
		
		sc.close();
    }
}
