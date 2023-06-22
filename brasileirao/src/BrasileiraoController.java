
public class BrasileiraoController {

    private BrasileiraoModel theModel;
    private BrasileiraoView theView;

    public BrasileiraoController(BrasileiraoView theView, BrasileiraoModel theModel) {
        this.theModel = theModel;
        this.theView = theView;
        Time cruzeiro = new Time(2, 1, 0, 0, 3, 1, 0);
        cruzeiro.atualizaPontos(cruzeiro,0, 0, 0, 0, 0);
        this.theModel.aloca(cruzeiro, "cruzeiro");

        this.theView.setTabela(theModel.tabela);
        theView.setVisible(true);
    }
    
}
