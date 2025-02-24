package presentation;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

public class PresentationV1 {

    public static void main(String[] args){
        IMetier metier = new MetierImpl(new DaoImplV2());
        System.out.println(metier.calcul());

        metier.setDao(new DaoImpl());

        System.out.println(metier.calcul());


    }
}
