package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import facade.Vizitator;

public class TestVizitatori {

	@Test
	public void test() {
		Vizitator v1 = new Vizitator();
		v1.cumparaBilet();
		int rezultat = v1.count;
		Vizitator v2 = new Vizitator();
		v2.cumparaBilet();
		rezultat = rezultat + v2.count;
		assertEquals(2, rezultat);
	}

}
