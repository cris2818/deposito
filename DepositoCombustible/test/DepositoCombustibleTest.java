import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible (40.0,5.0);
		double nivel=tank.getDepositoNivel();
		assertEquals(5.0,nivel,0.01);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible (40.0,5.0);
		double depMax=tank.getDepositoMax();
		assertEquals(40.0,depMax,0.01);		
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible (40.0,0.0);		
		assertEquals(true,tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible (40.0,20.0);		
		assertEquals(false,tank.estaLleno());
	}

}
