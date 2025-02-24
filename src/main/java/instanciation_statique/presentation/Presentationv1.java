package instanciation_statique.presentation;

import instanciation_statique.dao.DaoImpl;
import instanciation_statique.dao.DaoImplV2;
import instanciation_statique.metier.IMetier;
import instanciation_statique.metier.MetierImpl;

public class Presentationv1 {

    public static void main(String[] args){
        IMetier metier = new MetierImpl(new DaoImplV2());
        System.out.println(metier.calcul());

        metier.setDao(new DaoImpl());

        System.out.println(metier.calcul());


    }
}
