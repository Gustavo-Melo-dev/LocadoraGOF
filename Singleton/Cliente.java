//
package Singleton;

public class Cliente {

    public static void main(String[] args) {
                
    Locadora filmeLoc = Locadora.getInstancia();
    
    filmeLoc.filmeTerror();
    filmeLoc.filmeComedia();
    filmeLoc.filmeAcao();
    
    filmeLoc.filmeDocumentario();
    filmeLoc.filmeFiccaoCientifica();
    filmeLoc.filmeRomance();
    
    filmeLoc.gerarRelatorio();
    
    System.out.println(Locadora.getInstancia().gerarRelatorio());
        
    }
    
}
