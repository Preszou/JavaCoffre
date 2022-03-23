package Coffre.Etat;

import Coffre.Coffre;

public class Caché extends SuperEtat {

    @Override
    public void oterLivre(Coffre coffre)
    {
        coffre.setEtat(new Fermé());
    }

    @Override
    public String nomEtat(Coffre coffre) {
        return "CacheParBibliotheque";
    }


}
