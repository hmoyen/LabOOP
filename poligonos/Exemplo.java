
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(4);
        lista.add(5);
        Triangulo escaleno = new Triangulo(lista);
        System.out.println(escaleno.area());
        System.out.println(escaleno.pegaPerimetro());

    }
}