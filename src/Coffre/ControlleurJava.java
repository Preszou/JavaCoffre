package Coffre;

import Coffre.Coffre;
import Coffre.Interface.I_Observateur;

public class ControlleurJava {

    private Coffre coffre;

    public ControlleurJava()
    {
        coffre = new Coffre();
    }

    public void oterLivre() {
        coffre.oterLivre();
    }

    public void remettreLivre() {
        coffre.remettreLivre();
    }

    public void tournerChandelleVersDroite() {
        coffre.tournerChandelleVersDroite();
    }

    public void attache(I_Observateur o)
    {
        coffre.attache(o);
    }

    public void tournerChandelleVersGauche() {
        coffre.tournerChandelleVersGauche();
    }

    public void fermerCoffre() {
        coffre.fermerCoffre();
    }

    public void setLapinLibere(boolean pLapinLibere)
    {
        coffre.setLapinLibere(pLapinLibere);
    }

    public void setChienLibere(boolean pChienLibere)
    {
        coffre.setChienLibere(pChienLibere);
    }

    public boolean lapinEstLibere() {
        return coffre.lapinEstLibere();
    }

    public boolean chienEstLibere() {
        return coffre.chienEstLibere();
    }

    public String nomEtat() {
        return coffre.nomEtat();
    }



}
