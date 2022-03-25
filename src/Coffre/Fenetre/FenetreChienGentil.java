package Coffre.Fenetre;

import Coffre.Coffre;
import Coffre.Interface.I_Observateur;

import java.awt.*;
import javax.swing.*;

public class FenetreChienGentil extends JFrame implements I_Observateur {

	private JTextField txtChien;

	public FenetreChienGentil()
	{
		setTitle("Chien du Chateau Médiéval");
		setBounds(300,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labChien = new JLabel ("CHIEN");
		contentPane.add(labChien);
		txtChien = new JTextField(15);
		contentPane.add(txtChien);
		setVisible(true);
		afficherChien(false);
	}
	
	public void afficherChien(boolean libre)
	{
		if (libre == true)
			txtChien.setText("Le chien gentil est libéré");
		else 
			txtChien.setText("Le chien gentil est enfermé");
	}

	@Override
	public void miseAJour(Coffre coffre) {
		this.afficherChien(coffre.chienEstLibere());
	}
}