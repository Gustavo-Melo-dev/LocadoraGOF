// Ao proteger o construtor evitamos que a classe 
// possa ser instanciada em qualquer outro lugar do cÃ³digo que nÃ£o seja a prÃ³pria classe

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
 
    // mÃ©todo para retornar a referÃªncia para a fÃ¡brica
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
        return new String("Filme de comédia " + nome  + " alugado.");
    }
    public String filmeAcao(String nome) {
    	totalFilmeAcao++;
        return new String("Filme de ação " + nome  + " alugado.");
    }
    public String filmeDocumentario(String nome) {
    	totalFilmeDocumentario++;
        return new String("Filme de documentário " + nome  + " alugado.");
    }
    public String filmeFiccaoCientifica(String nome) {
    	totalFilmeFiccaoCientifica++;
        return new String("Filme de ficção científica " + nome  + " alugado.");
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
