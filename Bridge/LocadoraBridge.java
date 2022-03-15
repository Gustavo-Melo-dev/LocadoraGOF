package Bridge;

public class LocadoraBridge implements AbstractLocadora {
	
	public LocadoraBridge() {
	}

	@Override
	public String aberta() {
		return "Locadora está aberta!";
		
	}

	@Override
	public String fechada() {
		return "Locadora está fechada!";
		
	}

}
