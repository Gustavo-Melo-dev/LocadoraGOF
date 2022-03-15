package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Object> listaObjetos = new ArrayList<Object>();

		FilmeAcao filmeAcao = new FilmeAcao("Mad Max");
		listaObjetos.add(filmeAcao);
		
		FilmeRomance filmeRomance = new FilmeRomance("A culpa é das estrelas");
		listaObjetos.add(filmeRomance);
		
		FilmeTerror filmeTerror = new FilmeTerror("Fred vs Jason");
		listaObjetos.add(filmeTerror);
		
		FilmeDocumentario filmeDocumentario = new FilmeDocumentario("Jobs");
		listaObjetos.add(filmeDocumentario);
		
		FilmeComedia filmeComedia = new FilmeComedia("Sei lá");
		listaObjetos.add(filmeComedia);
		
		FilmeFiccaoCientifica filmeFiccaoCientifica = new FilmeFiccaoCientifica("Efeito Follow");
		listaObjetos.add(filmeFiccaoCientifica);
		
		for(Object filme : listaObjetos) {
			System.out.println(filme + " foi alugado!");
		}
	}
}
