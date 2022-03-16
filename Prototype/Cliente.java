package Prototype;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilmeAcao filmeLocAcao = new FilmeAcao();
		FilmePrototype clienteAcao = filmeLocAcao.clonar();
		clienteAcao.setNomeFilme("Vingadores");
		System.out.println(clienteAcao.exibirInfo());
		
		FilmeComedia filmeLocComedia = new FilmeComedia();
		FilmePrototype clienteComedia = filmeLocComedia.clonar();
		clienteComedia.setNomeFilme("Vovozona");
		System.out.println(clienteComedia.exibirInfo());
		
		FilmeDocumentario filmeLocDocumentario = new FilmeDocumentario();
		FilmeDocumentario clienteDocumentario = filmeLocDocumentario.clonar();
		clienteDocumentario.setNomeFilme("The decoding Bill Gates");
		System.out.println(clienteDocumentario.exibirInfo());
		
		FilmeFiccaoCientifica filmeLocFiccaoCientifica = new FilmeFiccaoCientifica();
		FilmeFiccaoCientifica clienteFiccaoCientifica = filmeLocFiccaoCientifica.clonar();
		clienteFiccaoCientifica.setNomeFilme("Efeito borboleta");
		System.out.println(clienteFiccaoCientifica.exibirInfo());
		
		FilmeRomance filmeLocRomance = new FilmeRomance();
		FilmeRomance clienteRomance = filmeLocRomance.clonar();
		clienteRomance.setNomeFilme("Barraca do beijo");
		System.out.println(clienteRomance.exibirInfo());
		
		FilmeTerror filmeLocTerror = new FilmeTerror();
		FilmeTerror clienteTerror = filmeLocTerror.clonar();
		clienteTerror.setNomeFilme("O massacre da serra elétrica");
		System.out.println(clienteTerror.exibirInfo());
	}

}
