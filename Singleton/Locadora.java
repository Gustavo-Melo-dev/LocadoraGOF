// Ao proteger o construtor evitamos que a classe 
// possa ser instanciada em qualquer outro lugar do código que não seja a própria classe

package Singleton;

public class Locadora {
    

    public static Locadora instancia; // referencia um objeto
    protected String nome;
    protected int totalFilmeTerror;
    protected int totalFilmeComedia;
    protected int totalFilmeAcao;
    protected int totalFilmeDocumentario;
    protected int totalFilmeFiccaoCientifica;
    protected int totalFilmeRomance;
        
 
    //construtor protegido
    protected Locadora() {
    }
 
    // método para retornar a referência para a fábrica
    public static Locadora getInstancia() {
        if (instancia == null)
            instancia = new Locadora();
        return instancia;
    }
    
    public String filmeTerror(String nome) {
    	totalFilmeTerror++;
        return new String("Filme de terror " + nome  + " alugado.");
    }

    public String filmeComedia(String nome) {
    	totalFilmeComedia++;
        return new String("Filme de com�dia " + nome  + " alugado.");
    }
    public String filmeAcao(String nome) {
    	totalFilmeAcao++;
        return new String("Filme de a��o " + nome  + " alugado.");
    }
    public String filmeDocumentario(String nome) {
    	totalFilmeDocumentario++;
        return new String("Filme de document�rio " + nome  + " alugado.");
    }
    public String filmeFiccaoCientifica(String nome) {
    	totalFilmeFiccaoCientifica++;
        return new String("Filme de fic��o cient�fica " + nome  + " alugado.");
    }
    public String filmeRomance(String nome) {
    	totalFilmeRomance++;
        return new String("Filme de romance " + nome  + " alugado.");
    }
    public int somar(){
        return totalFilmeAcao+ totalFilmeComedia + totalFilmeDocumentario + totalFilmeFiccaoCientifica + totalFilmeTerror + totalFilmeRomance;
    }

    public String gerarRelatorio() {
        return new String("\n" + "Total de filmes de  alugados: " + somar() + "\n");
    }
    
}
