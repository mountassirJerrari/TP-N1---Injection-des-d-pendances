package instanciation_statique.metier;

import instanciation_statique.dao.IDao;

public class MetierImpl implements  IMetier{

    IDao dao ;
    public  MetierImpl(IDao iDao){
        this.dao = iDao;
    }
    public void setDao(IDao iDao){
        this.dao = iDao;
    }
    @Override
    public double calcul() {
        return dao.getData()*23;
    }
}
