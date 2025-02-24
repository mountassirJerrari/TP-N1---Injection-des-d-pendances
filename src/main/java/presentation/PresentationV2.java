package presentation;


import dao.IDao;
import metier.IMetier;


import java.io.File;
import java.util.Scanner;

public class PresentationV2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class<?> cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class<?> cMetier= Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            metier.setDao(dao);

            System.out.println("resulat : "+ metier.calcul());



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
