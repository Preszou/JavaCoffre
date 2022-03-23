package Coffre.Etat;

import Coffre.Coffre;

public class Visible extends SuperEtat{

    @Override
    public void tournerChandelleVersGauche(Coffre coffre) {
        coffre.setEtat(new Bloqué());
        coffre.setLapinLibere(true);
    }

    @Override
    public String nomEtat(Coffre coffre) {
        return null;
    }


    @Override
    public void remettreLivre(Coffre coffre){
        coffre.setEtat(new Caché());
        coffre.setChienLibere(false);
    }





}
