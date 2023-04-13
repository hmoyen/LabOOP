public class Cliente {

    String nome;
    Endereco endereco;
    long RG;
    long CPF;
    
    int taxa;

    public Cliente(String nome, Endereco endereco, long RG, long CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.RG = RG;
        this.CPF = CPF;
        

    }


}

class ClienteComum extends Cliente {

    public ClienteComum(String nome, Endereco endereco, long RG, long CPF){
        super(nome,endereco, RG, CPF);
        taxa = 10;
    }

}
class ClientePreferencial extends Cliente {

    public ClientePreferencial(String nome, Endereco endereco, long RG, long CPF){
        super(nome,endereco, RG, CPF);
        taxa = 5;
    }
}