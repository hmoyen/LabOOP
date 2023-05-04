public class Retangulo implements ObjetoGeometrico, Comparavel {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea() {
        return largura*altura;
    }

    @Override
    public boolean ehMaiorQue(Comparavel outro) {
        double areaOutro = ((Retangulo)outro).calculaArea();
        return (calculaArea() >  areaOutro);
    }
}
