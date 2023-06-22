public class BrasileiraoGUIApp {

    public static void main(String[] args) {

        BrasileiraoView theView = new BrasileiraoView();

        BrasileiraoModel theModel = new BrasileiraoModel();

        BrasileiraoController theController = new BrasileiraoController(theView, theModel);

    }
    
}
