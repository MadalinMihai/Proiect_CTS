package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import observer.Director;

public class TestNotificare {

	// Verifica daca s a primit mesajul
	@Test
	public void testPrimesteNotificare() {
		Director director = new Director();
		boolean rezultat = false;
		if(director.notifica("Mesaj"))
		{
			rezultat = true;
		}
		assertTrue(rezultat);
	}
}
