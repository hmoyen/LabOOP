public class AnelRacional implements AnelAbstrato<Racional> {

    @Override
    public Racional produto(Racional este, Racional outro) {
        return este.soma(outro);
    }

    @Override
    public Racional soma(Racional este, Racional outro) {
       
        return este.soma(outro);
    }

    @Override
    public Racional zero() {
        return zero();
    }

    @Override
    public Racional um() {
        return um();
    }

    @Override
    public Racional negativo(Racional outro) {
        return outro.negativo();
    }
    
}
