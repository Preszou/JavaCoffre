package Coffre.Etat;

import Coffre.Coffre;

public class Cache extends SuperEtat {

    @Override
    public void oterLivre(Coffre coffre)
    {
        coffre.setEtat(new Ferme());
    }

    @Override
    public String nomEtat(Coffre coffre) {
        return "CacheParBibliotheque";
    }



}
