public class IdentificadorDeIngresso {
    
    Cliente titular;
    Evento evento;
    int codigo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public IdentificadorDeIngresso(Cliente titular, Evento evento, int codigo){
        this.titular = titular;
        this.evento = evento;
        this.codigo = codigo;

    }
}
