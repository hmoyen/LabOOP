// Proposta de refazer ex de Python para Java

import java.util.*;

public class Poligonos {

    static int numLados;
    static ArrayList<Integer> lados = new ArrayList<Integer>();

    public Poligonos(ArrayList<Integer> medidas)
    {
        lados = medidas;
        numLados = medidas.size();
        
    }


    public double pegaPerimetro() {
        int soma = 0;
        for (int i = 0; i < lados.size(); i++) {
            soma += lados.get(i);
        }
    return soma;
}
}

class Triangulo extends Poligonos {

    public Triangulo(ArrayList<Integer> medidas) {
        super(medidas);
        numLados = 3;
    }

    public double area() {
        double s = pegaPerimetro()/2;
        return Math.sqrt(s*(s-lados.get(0))*(s-lados.get(1))*(s-lados.get(2)));
    }

}

class Retangulo extends Poligonos{
    
    public Retangulo(ArrayList<Integer> medidas) {
        
        super(medidas);
        numLados = 4;
    }

    public double area() {
        return lados.get(0)*lados.get(1);
    }
}

class Quadrado extends Retangulo {
    public Quadrado(ArrayList<Integer> medidas){
        super(medidas);
    }
    @Override
    public double area() {
        return lados.get(0)*lados.get(0);
    }
}


    



