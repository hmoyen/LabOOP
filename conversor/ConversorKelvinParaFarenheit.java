public class ConversorKelvinParaFarenheit implements Conversor {
    
    public double converte(double temperatura) {
        return (temperatura - 273) * 9/5 + 32;    
    }

    @Override
    public Conversor clone() {
        return new ConversorKelvinParaFarenheit();
    }
}
