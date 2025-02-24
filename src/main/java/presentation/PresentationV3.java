package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.AppConfig;

public class PresentationV3 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean(IMetier.class);

        System.out.println("resultat = " + metier.calcul());
    }

}
