package FactoryMethod;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        // TODO code application logic here
		
    	Scanner sc = new Scanner(System.in);
		Locadora locadora = new Locadora();
		String nome;
		
		Filme filmeAcao = locadora.criarFilmeAcao();
		nome = sc.nextLine();
		System.out.println(filmeAcao.exibirInfo(nome));
		
//		Filme filmeComedia = locadora.criarFilmeComedia();
//		System.out.println(filmeComedia.exibirInfo("Se eu fosse você"));
		
//		Filme filmeRomance = locadora.criarFilmeRomance();
//		System.out.println(filmeRomance.exibirInfo("I love you"));
//		
//		Filme filmeTerror = locadora.criarFilmeTerror();
//		System.out.println(filmeTerror.exibirInfo("Ulalaaau"));
//		
//		Filme filmeDocumentario = locadora.criarFilmeDocumentario();
//		System.out.println(filmeDocumentario.exibirInfo("Jobs"));
//		
//		Filme filmeFiccaoCientifica = locadora.criarFilmeFiccaoCientifica();
//		System.out.println(filmeFiccaoCientifica.exibirInfo("Um aí"));
    }
    
}
