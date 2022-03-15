package Bridge;

public class FilmeBridge implements AbstractFilme {
	
	public String name;

	public FilmeBridge(String name) {
		this.name = name;
	}

	@Override
	public String filmeTerror() {
		return "Assistir filme de terror!";
		
	}

	@Override
	public String filmeRomance() {
		return "Assistir filme de romance!";
		
	}

	@Override
	public String filmeComedia() {
		return "Assistir filme " + this.name;
		
	}

	@Override
	public String filmeAcao() {
		return "Assistir filme " + this.name;
		
	}

	@Override
	public String  filmeDocumentario() {
		return "Assistir filme de document�rio!";
		
	}

	@Override
	public String filmeFiccaoCientifica() {
		return "Assistir filme de fic��o cient�fica!";
	}

	
}
