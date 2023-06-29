public class Data {

    int mes;
    int dia;

    public Data(int mes, int dia) {
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Data [mes=" + mes + ", dia=" + dia + "]";
    }

}
