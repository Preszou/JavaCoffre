package Coffre.Etat;

import Coffre.Coffre;

public class Ouvert extends SuperEtat {

    @Override
    public void fermerCoffre(Coffre coffre)
    {
        coffre.setEtat(new Fermé());
    }

    @Override
    public String nomEtat(Coffre coffre) {
        return "Ouvert";
    }
}
