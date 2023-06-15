public class ConversorIdentidade implements Conversor {


    public double converte(double temperatura) {
        return temperatura;
    }

    @Override
    public Conversor clone() {
        return new ConversorIdentidade();
    }    
    
}
