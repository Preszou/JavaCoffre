package Coffre;

import Coffre.Etat.Cache;
import Coffre.Etat.SuperEtat;
import Coffre.Interface.I_CoffreChateau;
import Coffre.Interface.I_Observateur;

import java.util.ArrayList;
import java.util.List;

public class Coffre implements I_CoffreChateau {

    private SuperEtat etat;
    private boolean lapinLibere;
    private boolean chienLibere;
    private List<I_Observateur> test = new ArrayList<I_Observateur>();

    public Coffre()
    {
        this.etat = new Cache();
        this.lapinLibere = false;
        this.chienLibere = false;
    }

    public void attache(I_Observateur o)
    {
        test.add(o);
    }

    private void avertir()
    {
        for(I_Observateur o : test)
        {
            o.miseAJour(this);
        }
    }


    public void setEtat(SuperEtat pEtat)
    {
        etat = pEtat;
        this.avertir();
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
