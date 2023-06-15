import java.util.HashMap;

public class FabricaConversor {
    
    private static HashMap<String, Conversor> conversores = new HashMap<>();

    public FabricaConversor() {
        conversores.put("CF", new ConversorCelsiusParaFarenheit());
        conversores.put("FC", new ConversorFarenheitParaCelsius());
        conversores.put("I", new ConversorIdentidade());
        conversores.put("KC", new ConversorKelvinParaCelsius());
        conversores.put("KF", new ConversorKelvinParaFarenheit());
        conversores.put("CK", new ConversorCelsiusParaKelvin());
        conversores.put("FK", new ConversorFarenheitParaKelvin());

    }

    public Conversor newConversor(String unidades) {
        return conversores.get(unidades).clone();
    }
}
