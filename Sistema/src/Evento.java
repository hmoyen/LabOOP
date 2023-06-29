public class Evento {

    static final double PATROCINADO = 1;
    static final double NAO_PATROCINADO = 0;
    
    int codigoEvento;
    String descricao;

    String dataEhora;
    Endereco casaDeEventos;
    int quantidadeIngressos;
    int idadeMinima;
    int precoBase;
    int tipo;
    double descontoPatrocinio;

    public Evento(int codigoEvento, String descricao, String dataEhora, Endereco casaDeEventos, int quantidadeIngressos,
            int idadeMinima, int precoBase, int tipo, double descontoPatrocinio) {
        this.codigoEvento = codigoEvento;
        this.descricao = descricao;
        this.dataEhora = dataEhora;
        this.casaDeEventos = casaDeEventos;
        this.quantidadeIngressos = quantidadeIngressos;
        this.idadeMinima = idadeMinima;
        this.precoBase = precoBase;
        this.tipo = tipo;
        this.descontoPatrocinio = descontoPatrocinio;
    }

    public Evento(int codigoEvento, String descricao, String dataEhora, Endereco casaDeEventos, int quantidadeIngressos,int idadeMinima, int precoBase, int tipo) {
        
        this.codigoEvento = codigoEvento;
        this.descricao = descricao;
        this.dataEhora = dataEhora;
        this.casaDeEventos = casaDeEventos;
        this.quantidadeIngressos = quantidadeIngressos;
        this.idadeMinima = idadeMinima;
        this.precoBase = precoBase;
        this.tipo = tipo;
        this.descontoPatrocinio = 0;
    }

    

    
}
