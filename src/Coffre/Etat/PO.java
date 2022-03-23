package Coffre.Etat;

import Coffre.Coffre;

public class PO extends Visible{

    @Override
    public void tournerChandelleVersDroite(Coffre coffre) {

        coffre.setEtat(new Ouvert());
    }


    public String nomEtat(Coffre coffre)
    {
        return "PresqueOuvert";
    }


}
