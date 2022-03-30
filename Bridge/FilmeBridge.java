package Bridge;

public class FilmeBridge implements AbstractFilme {
	
	public String name;

	public FilmeBridge(String name) {
		this.name = name;
	}

	@Override
	public String filmeTerror() {
		return "Filme de terror " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeRomance() {
		return "Filme de romance " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeComedia() {
		return "Filme de com�dia " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeAcao() {
		return "Filme de acao" + this.name + " foi alugado!";
		
	}

	@Override
	public String  filmeDocumentario() {
		return "Filme de document�rio " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeFiccaoCientifica() {
		return "Filme de fic��o " + this.name + " foi alugado!";
	}

	
}
