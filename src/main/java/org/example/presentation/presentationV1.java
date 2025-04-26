package org.example.presentation;

import org.example.extension.DaoImplV2;
import org.example.metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        /**
         * injection de deps par instanciation statique --> new ...()
         */
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao); //injection via le constructeur
        //metier.setdao(dao); //injection via setter
        System.out.println(metier.calcul());


    }
}
