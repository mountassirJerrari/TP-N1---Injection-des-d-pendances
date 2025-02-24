package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements  IMetier{
    @Autowired
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
