package Coffre.Etat;

import Coffre.Coffre;

public class Ferme extends Visible{

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setChienLibere(true);

        coffre.setEtat(new PO());
    }

    @Override
    public void tournerChandelleVersGauche(Coffre coffre){
        coffre.setEtat(new Bloque());
        coffre.setLapinLibere(true);
    }

    public String nomEtat(Coffre coffre)
    {
        return "Ferme";
    }





}
