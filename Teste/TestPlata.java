package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import strategy.DepartamentHR;
import strategy.SalariuPeCard;

public class TestPlata {
private static DepartamentHR hr;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		hr = new DepartamentHR(new SalariuPeCard());
		System.out.println("Inainte de clasa se initializeaza clasele de care avem nevoie");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Mesaj dupa clasa");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Mesaj setUP");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Mesaj teadDown");
	}
	
	// testeaza daca plata s-a facut la timp
	@org.junit.Test
	public void testPlata() {
		assertTrue(hr.dataLaCareSePlatescSalarii(10));
	}
		
	// Verific metoda de penalitati
	@org.junit.Test
	public void testPenalitati(){
		int rezultatAsteptat = 150;
		assertEquals(rezultatAsteptat, hr.penalitati(15));
	}
		
	// verific daca introduc o data inainte de termen
	@org.junit.Test
	public void testPenalitatiInainteDeTermen(){
		int rezultatAsteptat = 0;
		assertEquals(rezultatAsteptat, hr.penalitati(8));
	}
		
	// verific daca plata se face corect
	@org.junit.Test
	public void testPlataCorecta(){
		SalariuPeCard salariu = new SalariuPeCard();
		assertEquals(salariu.administreazaSalarii(), hr.plateste());
	}
		
	// verific calcularea primei
	@org.junit.Test
	public void testPrima(){
		assertEquals(30, hr.prima(100),0.2);
	}
		
	// verifica noul salariu pe baza primei
	@org.junit.Test
	public void testNoulSalariu(){
		assertEquals(130, hr.noulSalariu(100),0.2);
	}
		
	// verific costul total al salariului
	@org.junit.Test
	public void testSalariiTotale(){
		double salariuTotal=0;
		for(int i=0;i<3;i++)
		{
			salariuTotal = hr.cheltuieliCuSalarii(150);
		}
		assertEquals(450, salariuTotal,0.2);
	}
		
	// verifica nrAngajati
	@org.junit.Test
	public void testNrAngajati(){
		assertEquals(5, hr.verificaNrAngajati(5));
	}
		
	// verifica nrAnimale
	@org.junit.Test
	public void testNrAnimale(){
		assertEquals(5, hr.verificaNrAngajati(5));
	}
		
	//verifica raport agajati/animale
	@org.junit.Test
	public void testRaportAnimalePersoana(){
		assertTrue(hr.verificaRaportAnimaleAngajati(5, 5));
		assertFalse(hr.verificaRaportAnimaleAngajati(4, 8));
	}
}