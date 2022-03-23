package Coffre.Etat;

import Coffre.Coffre;

public abstract class SuperEtat {

        private String nom;

        public void oterLivre(Coffre coffre) {};

        public  void remettreLivre(Coffre coffre) {};

        public  void tournerChandelleVersDroite(Coffre coffre) {};

        public  void tournerChandelleVersGauche(Coffre coffre) {};

        public  void fermerCoffre(Coffre coffre) {};

        public abstract String nomEtat(Coffre coffre);


}




