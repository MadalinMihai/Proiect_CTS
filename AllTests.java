package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAnimal.class, TestGradinaZoologica.class, TestNotificare.class, TestPlata.class,
		TestTipAngajat.class, TestVizitatori.class})

public class AllTests {

}
