import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

public class TestCafetera {
 
	@Test
	public void deberiaDevolverVSiExisteCafe() {
		
		Cafetera cafetera = new Cafetera(10);
		
		boolean resultado = cafetera.hasCafe(5);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSinoExisteCafe() {
		
		Cafetera cafetera = new Cafetera(10);
		
		boolean resultado = cafetera.hasCafe(11);
		assertEquals(false, resultado);
	}
	
	@Test
	public void deberiaRestarCafeACafetera() {
		
		Cafetera cafetera = new Cafetera(10);
		
		cafetera.giveCafe(7);
		assertEquals(3, cafetera.getCantidadDeCafe());
		
	}

}
