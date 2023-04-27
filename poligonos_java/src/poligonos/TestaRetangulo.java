package poligonos;

public class TestaRetangulo {

    int passou = 0;
    int nao_passou= 0;

    public boolean testaArea() {
        Retangulo ret = new Retangulo(2,3);
        if(ret.calculaÁrea() == 6) {
            passou += 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean testaPerimetro() {
        Retangulo ret = new Retangulo(3,4);
        if(ret.calculaPerímetro() == 14) {
            passou += 1;
            return true;
        } else {
            nao_passou += 1;
            return false;
        }
    }
}
