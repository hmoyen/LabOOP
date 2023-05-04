public class AnelBooleano implements AnelAbstrato<Boolean> {

    @Override
    public Boolean negativo(Boolean outro) {
        
        return -outro;
    }

    @Override
    public Boolean produto(Boolean este, Boolean outro) {
        // TODO Auto-generated method stub
        return este*outro;
    }

    @Override
    public Boolean soma(Boolean este, Boolean outro) {
        // TODO Auto-generated method stub

        return este+outro;
    }

    @Override
    public Boolean um() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Boolean zero() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
