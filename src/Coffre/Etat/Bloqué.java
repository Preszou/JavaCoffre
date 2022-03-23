package Coffre.Etat;

import Coffre.Coffre;

public class Bloqué extends SuperEtat {

    public Bloqué()
    {

    }

    @Override
    public String nomEtat(Coffre coffre) {
        return "Bloque";
    }
}
