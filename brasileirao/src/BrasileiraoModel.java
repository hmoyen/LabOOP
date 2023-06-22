import java.util.HashMap;

public class BrasileiraoModel {

    HashMap<String, Time> tabela = new HashMap<>();

    public void aloca(Time time, String nome) {
        tabela.put(nome, time);
    }

}
