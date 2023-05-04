public class Circulo implements ObjetoGeometrico, Comparavel {
    private double raio;
    public double calculaArea() {
        return Math.PI*(raio*raio);
    }
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double pegaRaio() {
        return raio;
    }
    @Override
    public boolean ehMaiorQue(Comparavel outro) {
        double raioOutro = ((Circulo)outro).pegaRaio();
        return (pegaRaio() >  raioOutro);
    }
}
