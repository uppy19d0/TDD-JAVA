import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestVaso {

	@Test
	public void deberiaDevolverVerdaderoSiExistenVasos() {
		
		Vaso vasosPequenos = new Vaso(2, 10);
		
		boolean resultado = vasosPequenos.hasVasos(1);
		
		assertEquals(true, resultado);
		 
	}
	
	@Test
	public void deberiaDevolverFalseSiNoExistenVasos() {
		
		Vaso vasosPequenos = new Vaso(1, 3);
		
		boolean resultado = vasosPequenos.hasVasos(2);
		
		assertEquals(false, resultado);
		
	}
	
	@Test
	public void deberiaRestarCantidadDeVasos() {
		
		Vaso vasosPequenos = new Vaso(5, 10);
		
		vasosPequenos.giveVasos(1);
		
		assertEquals(4, vasosPequenos.getCantidadDeVasos());
		
	}

}
