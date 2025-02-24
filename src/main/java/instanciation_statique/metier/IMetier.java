package instanciation_statique.metier;

import instanciation_statique.dao.IDao;

public interface IMetier {

    double calcul();
    void setDao(IDao dao);
}
