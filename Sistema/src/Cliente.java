public abstract class Cliente {


    private long CPF;
    private int idade;
    private String nome;
    private Endereco endereco;
    private String email;
    private int telefone;
    StrategyDesconto desconto;


    public long getCPF() {
        return CPF;
    }

    public void setCPF(long cPF) {
        CPF = cPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cliente(long CPF, int idade, String nome, Endereco endereco, String email, int telefone, StrategyDesconto desconto) {

        this.CPF = CPF;
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.desconto = desconto;

    }


    public String toString() {
        String res = "-- Cliente ---------------------";
        res += "\nNOME: " + nome;
        res += "\nCPF: " + CPF;
        res += "\nIdade: " + idade;
        res += "\nEndereço: " + endereco;
        return res;
    }

}
