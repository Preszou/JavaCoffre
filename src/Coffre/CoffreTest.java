package Coffre;

import static org.junit.Assert.*;

import Coffre.Interface.I_CoffreChateau;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffreTest {

	private I_CoffreChateau coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("CacheParBibliotheque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtChandelleGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresApresAvoirOteLeLivreDeLaBibliothequeEtChandelleDroite(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtChandelleGaucheEtOterLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.oterLivre();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliothequeEtChandelleDroitePuisChandelleGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}



	@Test
	public void testApresApresAvoirOteLeLivreDeLaBibliothequeEtAvoirTournerChandelleDroiteDeuxFois(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testpresAvoirOteLeLivreDeLaBibliothequeEtAvoirTournerChandelleDroiteDeuxFoisEtFermeCoffre(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("Ferme",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresApresAvoirOteLeLivreDeLaBibliothequeEtAvoirTournerChandelleDroiteDeuxFoisEtFermeCoffreEtRemisLivre(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresApresAvoirOteLeLivreDeLaBibliothequeEtAvoirTournerChandelleDroiteDeuxFoisEtFermeCoffreEtRemisLivrePuisOterLivre(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testOterLivreDeuxFois(){
		coffre.oterLivre();
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testTournerChandelleDroiteSansAvoirOterLivre(){
		coffre.tournerChandelleVersDroite();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testTournerChandelleGaucheSansAvoirOterLivre(){
		coffre.tournerChandelleVersGauche();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testOuvrirCoffreEtRemettreLeLivre(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("Ouvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

}