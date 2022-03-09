// Ao proteger o construtor evitamos que a classe 
// possa ser instanciada em qualquer outro lugar do código que não seja a própria classe

package Singleton;

public class Locadora {
    

    public static Locadora instancia; // referencia um objeto
    protected string nome;
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
    
    public String filmeTerror() {
        return new String("Carro Volks " + totalFilmeTerror++ + " criado ");
    }

    public String filmeComedia() {
        return new String("Carro Volks " + totalFilmeComedia++ + " criado ");
    }
    public String filmeAcao() {
        return new String("Carro Volks " + totalFilmeAcao++ + " criado ");
    }
    public String filmeDocumentario() {
        return new String("Carro Volks " + totalFilmeDocumentario++ + " criado ");
    }
    public String filmeFiccaoCientifica() {
        return new String("Carro Volks " + totalFilmeFiccaoCientifica++ + " criado ");
    }
    public String filmeRomance() {
        return new String("Carro Volks " + totalFilmeRomance++ + " criado ");
    }
    public int somar(){
        return totalFilmeAcao+ totalFilmeComedia + totalFilmeDocumentario + totalFilmeFiccaoCientifica + totalFilmeTerror + totalFilmeRomance;
    }

    public String gerarRelatorio() {
        return new String("\n" + "Total de filmes de  alugados: " + somar() "\n");
    }
    
}
