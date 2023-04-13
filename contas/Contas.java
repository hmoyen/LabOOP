
import java.util.*;

public class Contas {
    ArrayList<Cliente> titulares = new ArrayList<Cliente>();
    int numTitulares;
    
    public Contas(ArrayList<Cliente> titulares) {
        this.titulares = titulares;
        

    }

    public void MostraDados()
    {
        for(int i = 0; i< titulares.size(); i++){
            System.out.println(titulares.get(i).nome);
            System.out.println(titulares.get(i).RG);
            System.out.println(titulares.get(i).CPF);
            System.out.println(titulares.get(i).endereco.CEP);
            System.out.println(titulares.get(i).endereco.cidade);
            System.out.println(titulares.get(i).endereco.complemento);
            System.out.println(titulares.get(i).endereco.estado);
            System.out.println(titulares.get(i).endereco.numero);
            System.out.println(titulares.get(i).endereco.moradores);
            
        }
            
    }
    
}

class ContaIndiv extends Contas {

    public ContaIndiv(ArrayList<Cliente> titulares) {
        super(titulares);
        numTitulares = 1;
        

    }


}
class ContaConj extends Contas {

    static Cliente titular;
    ArrayList<Cliente> dependentes = new ArrayList<Cliente>();

    public ContaConj(ArrayList<Cliente> titulares) {
        super(titulares);
        numTitulares = titulares.size();

    }

}
