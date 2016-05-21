package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import builder.Animal;
import builder.AnimalNou;

public class TestAnimal {
	private static Animal animal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		animal = new Animal();
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

	// verifica numele animalului
	@Test
	public void testAnimal() {
		animal.setNume("Girafa");
		String rezultatAsteptat = "Girafa";
		assertEquals(animal.descriere(),rezultatAsteptat);
	}
	
	// verifica daca numarul de elemente este corect
	@Test
	public void testAdaugaAnimalNou()
	{
		List<Animal> listaAnimale = new ArrayList<Animal>();
		int count = 0;
		int rezultatAsteptat = 1;
		AnimalNou animalNou = new AnimalNou();
		listaAnimale.add(animalNou.adauga());
		for(Animal animal : listaAnimale)
		{
			count++;
		}
		assertEquals(count, rezultatAsteptat);
	}
	
	// verifica daca s-a inserat cu succes
	@Test
	public void testAdaugaAnimalNou2()
	{
		List<Animal> listaAnimale = new ArrayList<Animal>();
		boolean areAnimale = false;
		AnimalNou animalNou = new AnimalNou();
		listaAnimale.add(animalNou.adauga());
		if(listaAnimale.size() != 0)
		{
			areAnimale = true;
		}
		assertTrue(areAnimale);
	}
	
	@Test
	public void testVerificaAtributeAnimal()
	{
		animal.setNume("camila");
		assertEquals("camila",animal.getNume());
	}
	
	// verific daca animalele au pui
	@Test
	public void testVerificaPui()
	{
		animal.identificaPui(true);
		
		assertTrue(animal.identificaPui(true));
	}
	
	// Verific daca mi-a adaugat in lista
	@Test
	public void verificaListaPui()
	{
		animal.identificaPui(true);
		
		assertNotNull(animal.listaPui);
	}
	
	// Verific daca mi-a adaugat in lista
	@Test
	public void verificaCatiPuiAre()
	{
		Animal animal = new Animal();
		animal.listaPui.add(new Animal());
		animal.listaPui.add(new Animal());
		animal.listaPui.add(new Animal());
		
		assertEquals(3, animal.calculeazaNrPui());
	}
}
