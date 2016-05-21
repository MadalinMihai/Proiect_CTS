package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import facade.GradinaZoologica;
import facade.Vizitator;

public class TestGradinaZoologica {

	// testez daca inventarul a fost calculat corect
	@Test
	public void testInventar() {
		GradinaZoologica gradinaZoologica = new GradinaZoologica();
		float rezultatAsteptat = 300;
		float rezultat = gradinaZoologica.inventar(180)+gradinaZoologica.inventar(120);
		assertEquals(rezultatAsteptat, rezultat,0.2);
	}

	// testez inventarul daca introduc o valoare negativa
	@Test
	public void testInventar2() {
		GradinaZoologica gradinaZoologica = new GradinaZoologica();
		float rezultatAsteptat = 0;
		float rezultat = gradinaZoologica.inventar(-180);
		assertEquals(rezultatAsteptat, rezultat,0.2);
	}

	// testez daca calatorul a cumparat bilet
	@Test
	public void testACumparatBilet() {
		Vizitator vizitator = new Vizitator();
		boolean rezultat = false;
		if(vizitator.cumparaBilet())
		{
			rezultat = true;
		}
		assertTrue(rezultat);
	}
}
