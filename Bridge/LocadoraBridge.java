package Bridge;

public class LocadoraBridge implements AbstractLocadora {
	
	public LocadoraBridge() {
	}

	@Override
	public String aberta() {
		return "Locadora est� aberta!";
		
	}

	@Override
	public String fechada() {
		return "Locadora est� fechada!";
		
	}

}
