public class Ingresso {

    static final double RETIRADO = 0;
    static final double ENTREGUE = 1;

    IdentificadorDeIngresso id;
    int forma;
    int frete;

    public IdentificadorDeIngresso getId() {
        return id;
    }

    public void setId(IdentificadorDeIngresso id) {
        this.id = id;
    }

    public int getForma() {
        return forma;
    }

    public void setForma(int forma) {
        this.forma = forma;
    }

    public int getFrete() {
        return frete;
    }

    public void setFrete(int frete) {
        this.frete = frete;
    }

    public Ingresso(IdentificadorDeIngresso id, int forma) {
        this.id = id;
        this.forma = forma;
    }

    public void temFrete() {
        if (forma == ENTREGUE) {
            frete = 1;
        } else {
            frete = 0;
        }
    }

    public String toString() {
        String res = "-- Ingresso ---------------------";
        res += "\nTITULAR: " + id.titular.getNome();
        res += "\nEVENTO:  " + id.evento.getDescricao();

        if (frete == 1) {
            res += "\n Terá entrega em casa";
        }
        return res;
    }

}
