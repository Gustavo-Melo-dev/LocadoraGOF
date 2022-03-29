package TemplateMethod;

public abstract class Produtora {
	
	final void criarFilme() {
		exibirInfo();	
	}
	
	abstract String exibirInfo();

}
