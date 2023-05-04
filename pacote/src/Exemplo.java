import java.util.ArrayList;

public class Exemplo {

    private static void compara(Comparavel obj1, Comparavel obj2) {
        if (obj1.ehMaiorQue(obj2)) {
            System.out.println("obj1 > obj2");
        } else {
            System.out.println("obj1 <= obj2");
        }
    }
    public static void main(String[] args) throws Exception {
        Retangulo ret = new Retangulo(3, 4);
        Circulo circ = new Circulo(2);
        Retangulo ret2 = new Retangulo(4, 4);
        Circulo circ2 = new Circulo(3);

        System.out.println(circ);

        ArrayList<ObjetoGeometrico> objetos = new ArrayList<>();
        objetos.add(ret);
        objetos.add(circ);
        objetos.add(ret2);
        objetos.add(circ2);

        for (ObjetoGeometrico objeto : objetos) {
            double area = objeto.calculaArea();
            System.out.println("Área: " + area);
        }

        if (ret.ehMaiorQue(ret2)) {
            System.out.println("Ret > Ret2");
        } else {
            System.out.println("Ret <= Ret2");
        }

        if (circ.ehMaiorQue(circ2)) {
            System.out.println("circ > circ2");
        } else {
            System.out.println("circ <= circ2");
        }

        compara(ret,ret2);
        compara(circ, circ2);

    }
}
