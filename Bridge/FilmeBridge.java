package Bridge;

public class FilmeBridge implements AbstractFilme {
	
	public String name;

	public FilmeBridge(String name) {
		this.name = name;
	}

	@Override
	public String filmeTerror() {
		return "Filme " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeRomance() {
		return "Filme " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeComedia() {
		return "Filme " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeAcao() {
		return "Filme " + this.name + " foi alugado!";
		
	}

	@Override
	public String  filmeDocumentario() {
		return "Filme " + this.name + " foi alugado!";
		
	}

	@Override
	public String filmeFiccaoCientifica() {
		return "Filme " + this.name + " foi alugado!";
	}

	
}
