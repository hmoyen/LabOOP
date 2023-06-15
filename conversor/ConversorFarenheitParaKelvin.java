public class ConversorFarenheitParaKelvin implements Conversor {

    public double converte(double temperatura) {
        return (temperatura - 32) * 5/9 + 273;    
    }

    @Override
    public Conversor clone() {
        return new ConversorFarenheitParaKelvin();
    }
    
}
