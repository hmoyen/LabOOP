public class Endereco {
    private String logradouro;
    private int número;
    private String complemento;
    private String CEP;
    private String cidade;
    private String estado;
    private String país;
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Endereco(String logradouro, int número, String complemento, String CEP, String cidade, String estado,
    String país) {
        this.logradouro = logradouro;
        this.número = número;
        this.complemento = complemento;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
    }    

    public String toString() {
        return this.logradouro + ", " + this.número + " " + this.complemento + 
        " CEP " + this.CEP + " " + this.cidade + ", " + this.estado + " - " + this.país;
    }
}
