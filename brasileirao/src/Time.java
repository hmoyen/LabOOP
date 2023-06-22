public class Time {
    
    int numVitorias;
    int numEmpates;
    int numDerrotas;
    int pontuacao;
    int golsPro;
    int golsContra;
    int saldoGols;

        
    public Time(int numVitorias, int numEmpates, int numDerrotas, int pontuacao, int golsPro, int golsContra,
            int saldoGols) {
        this.numVitorias = numVitorias;
        this.numEmpates = numEmpates;
        this.numDerrotas = numDerrotas;
        this.pontuacao = pontuacao;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.saldoGols = saldoGols;
    }

    public void atualizaPontos(Time time, int novaDerrota, int novoEmpate, int novaVitoria, int novoGolPro, int novoGolContra){
        time.pontuacao = 3*(time.numVitorias + novaVitoria) + (time.numEmpates + novoEmpate) - (time.numDerrotas + novaDerrota);
        time.golsContra = time.golsContra + novoGolContra;
        time.golsPro = time.golsPro + novoGolPro;
        time.saldoGols = time.golsPro - time.golsContra;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public String toString(Time time) {
        
        return "Time" + time + "[numVitorias=" + time.numVitorias + ", numEmpates=" + time.numEmpates + ", numDerrotas=" + time.numDerrotas
                + ", pontuacao=" + time.pontuacao + ", golsPro=" + time.golsPro + ", golsContra=" + time.golsContra + ", saldoGols="
                + time.saldoGols + "]";
    }

   
}
