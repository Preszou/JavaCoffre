package Coffre;

import Coffre.Etat.Caché;
import Coffre.Etat.SuperEtat;

public class Coffre implements I_CoffreChateau{

    private SuperEtat etat;
    private boolean lapinLibere;
    private boolean chienLibere;

    public Coffre()
    {
        this.etat = new Caché();
        this.lapinLibere = false;
        this.chienLibere = false;
    }

    public void setEtat(SuperEtat pEtat)
    {
        etat = pEtat;
    }

    @Override
    public void oterLivre() {
        etat.oterLivre(this);
    }

    @Override
    public void remettreLivre() {
        etat.remettreLivre(this);
    }

    @Override
    public void tournerChandelleVersDroite() {
        etat.tournerChandelleVersDroite(this);
    }

    @Override
    public void tournerChandelleVersGauche() {
        etat.tournerChandelleVersGauche(this);
    }

    @Override
    public void fermerCoffre() {
        etat.fermerCoffre(this);
    }

    public void setLapinLibere(boolean pLapinLibere)
    {
        this.lapinLibere = pLapinLibere;
    }

    public void setChienLibere(boolean pChienLibere)
    {
        this.chienLibere = pChienLibere;
    }

    @Override
    public boolean lapinEstLibere() {
        return this.lapinLibere;
    }

    @Override
    public boolean chienEstLibere() {
        return this.chienLibere;
    }

    @Override
    public String nomEtat() {
        return this.etat.nomEtat(this);
    }
}
