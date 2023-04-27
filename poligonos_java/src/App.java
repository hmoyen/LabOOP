import poligonos.*;

public class App {
    public static void main(String[] args) {
        // Cria pentágono regular de lado 4cm
        Poligono pentágono = new Poligono(5, 4, "pentágono");
        // pentágono._tipo = "pentágono"; // Gera erro de acesso
        System.out.println(pentágono);
        System.out.println("Perímetro do pentágono: " + pentágono.calculaPerímetro());
        Retangulo retângulo = new Retangulo(3, 4);
        System.out.println(retângulo);
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());
        retângulo._lados[0] = 10; // não gera erro de acesso pois _lados é protected
        // note que isso viola a modularidade do código
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());

        if (pentágono.éCompatívelCom(retângulo)) 
          System.out.println("Pentágono e retângulo são compatíveis");
        else
          System.out.println("Pentágono e retângulo não são compatíveis");

        Retangulo quadrado = new Retangulo(5);
        System.out.println(quadrado);
        System.out.println("Área do quadrado: " + quadrado.calculaÁrea());

        System.out.println("Foram criados " + Poligono.quantosPolígonos() + " polígonos");

        if (Poligono.sãoCompatíveis(quadrado, retângulo)) 
          System.out.println("Quadrado e retângulo são compatíveis");
        else
          System.out.println("Quadrado e retângulo não são compatíveis");

    }
}
