package Coffre.Etat;

import Coffre.Coffre;

public class Bloque extends SuperEtat {

    public Bloque()
    {

    }

    @Override
    public String nomEtat(Coffre coffre) {
        return "Bloque";
    }


}
