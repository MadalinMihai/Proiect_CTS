package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import simpleFactory.AngajatCuExperienta;
import simpleFactory.AngajatFaraExperienta;
import simpleFactory.TipAngajat;

public class TestTipAngajat {

	// verifica tipul angajatului
	@Test
	public void testVerificaTipul() {
		TipAngajat tip = new TipAngajat();
		String rezultat = "cuExperienta";
		assertEquals(rezultat, tip.getAngajat(rezultat).toString());
	}	
	
	@Test
	public void testVerificaVarsta() {
		AngajatCuExperienta angajat = new AngajatCuExperienta("Popescu",20);
		assertTrue(angajat.verificaVarsta(20));
	}
	
	// verifica media de varsta
	@Test
	public void testVerificaMedieVarsta(){
		AngajatFaraExperienta angajati = new AngajatFaraExperienta();
		angajati.listaAngajati.add(new AngajatFaraExperienta("Popescu",20));
		angajati.listaAngajati.add(new AngajatFaraExperienta("Popescu",30));
		angajati.listaAngajati.add(new AngajatFaraExperienta("Popescu",40));
		assertEquals(30, angajati.medieVarsta());
	}
}
