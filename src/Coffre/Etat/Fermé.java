package Coffre.Etat;

import Coffre.Coffre;

public class Fermé extends Visible{

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {
        coffre.setEtat(new PO());
        coffre.setChienLibere(true);
    }

    @Override
    public void tournerChandelleVersGauche(Coffre coffre){
        coffre.setEtat(new Bloqué());
        coffre.setLapinLibere(true);
    }

    public String nomEtat(Coffre coffre)
    {
        return "Ferme";
    }





}
