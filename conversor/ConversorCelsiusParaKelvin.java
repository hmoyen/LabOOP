public class ConversorCelsiusParaKelvin implements Conversor {
    
    public double converte(double temperatura) {
        return temperatura+273;    
    }

    @Override
    public Conversor clone() {
        return new ConversorCelsiusParaKelvin();
    }
}
