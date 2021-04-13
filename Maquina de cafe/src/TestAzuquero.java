import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAzuquero {
	
	Azucarero azuquero;
	 
	@Before
	public void setUp() {
		azuquero = new Azucarero(10);
	}
	
	@Test
	public void debeDevolverVsiHaySuficienteAzucar() {
		
		boolean resultado = azuquero.hasAzucar(5);
		
		assertEquals(true , resultado);
		
		resultado = azuquero.hasAzucar(10);
		
		assertEquals(true , resultado);
		
	}
	
	@Test
	public void debeDevolverFsiNoHaySuficienteAzucar() {
		
		boolean resultado = azuquero.hasAzucar(15);
		
		assertEquals(false , resultado);
		
		
	}
	
	@Test
	public void deberiaRestarAzucarAlazuquero() {
		
		azuquero.giveAzucar(5);
		
		assertEquals(5, azuquero.getCantidadDeAzucar());
		
		azuquero.giveAzucar(2);
		
		assertEquals(3, azuquero.getCantidadDeAzucar());
		
	}
	

}
