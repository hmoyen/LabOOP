public class Racional {
    int num, den = 1;

    private static int mdc(int m, int n) {
        if (n == 0) return m;
        else return mdc(n, m % n);
    }

    public Racional(int numerador, int denominador) {
        if(numerador!=0) {
        int d = mdc(numerador, denominador);
        num = numerador / d;
        den = denominador / d;
        }

    }

    Racional zero() {
        return new Racional(0, den);

    }
    Racional um() {
        return new Racional(1, den);

    }

    Racional soma(Racional r){
        return new Racional(num*r.den + r.num*den, den*r.den);
    }

    Racional produto(Racional r) {
        return new Racional((num*r.num), den*r.den);
    }

    Racional negativo() {
        return new Racional(-num, den);
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }
}
