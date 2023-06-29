public class Venda {

    Evento evento;
    Ingresso ingresso;
    double valorFinal;
    double valorEfetivo;
    double valorComImposto;
    Data data;

    public Venda(Evento evento, Ingresso ingresso, Data data) {
        this.evento = evento;
        this.ingresso = ingresso;
        this.data = data;
    }

    public double calculaDesconto() {

        double descontoCliente;

        if (ingresso.id.titular.getAssinatura() == 1) {

             descontoCliente =  0.5;

        } else {
             descontoCliente =  0;

        }

        if(ingresso.id.titular.getIdade() < 25) {

            descontoCliente = 1 - (0.5 - evento.getDescontoPatrocinio()*0.5);

            return descontoCliente;
        }

        else if (descontoCliente > evento.getDescontoPatrocinio()) {
            
            return descontoCliente;

        } else {

            return evento.getDescontoPatrocinio();
        }
    }

    public boolean verificaIdade() {

        if (ingresso.id.titular.getIdade() < evento.getIdadeMinima()) {
            return false;
        } else {
            return true;
        }

    }

    public int calculaFrete() {

        if (evento.getCasaDeEventos().getCidade() == ingresso.id.titular.getEndereco().getCidade()) {
            return 10;
        } else {
            return 30;
        }
    }

    public double calculaValorFinal() {

        valorEfetivo = evento.getPrecoBase() - evento.getPrecoBase() * calculaDesconto();
        valorComImposto = valorEfetivo * 1.12;
        if (ingresso.forma == 1) {
            valorFinal = valorComImposto + calculaFrete();
        } else {
            valorFinal = valorComImposto;
        }
        return valorFinal;

    }

    public String toString() {
        String res = "-- Venda---------------------";
        res += "\nVALOR FINAL: " + calculaValorFinal();

        return res;
    }

}
