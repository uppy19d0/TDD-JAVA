import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe {
	
	Cafetera cafetera;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azuquero;
	MaquinaDeCafe maquinaDeCafe;
	
	@Before
	public void setUp() {
		cafetera = new Cafetera(50);
		vasosPequeno = new Vaso(5, 10);
		vasosMediano = new Vaso(5, 20);
		vasosGrande = new Vaso(5, 30);
		azuquero = new Azucarero(20);
		
		maquinaDeCafe = new MaquinaDeCafe();
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setVasoPequeno(vasosPequeno);
		maquinaDeCafe.setVasoMediano(vasosMediano);
		maquinaDeCafe.setVasoGrande(vasosGrande);
		maquinaDeCafe.setAzucar(azuquero);
		
	}
	
	@Test
	public void deberiaDevolverUnVasoMediano() {
		Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
		
		assertEquals(maquinaDeCafe.getVasoMediano(), vaso);
	}
	
	@Test
	public void deberiaDevolverUnVasoPequeno() {
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		assertEquals(maquinaDeCafe.getVasoPequeno(), vaso);
	}
	
	@Test
	public void deberiaDevolverUnVasoGrande() {
		Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
		
		assertEquals(maquinaDeCafe.getVasoGrande(), vaso);
	}
	
	@Test
	public void deberiaDevolverNoHayVasos() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);
		
		assertEquals("No hay vasos", resultado);
	}
	
	@Test
	public void deberiaDevolverNoHayCafe() {
		
		Cafetera cafetera = new Cafetera(5);
		maquinaDeCafe.setCafetera(cafetera);
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2);
		
		assertEquals("No hay cafe", resultado);
	}
	
	@Test
	public void deberiaDevolverNoHayAzucar() {
		
		Azucarero azuquero = new Azucarero(2);
		maquinaDeCafe.setAzucar(azuquero);
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		assertEquals("No hay azucar", resultado);
	}
	
	@Test
	public void deberiaRestarCafe() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getCafetera().getCantidadDeCafe();
		
		assertEquals(40, resultado);
	}
	
	@Test
	public void deberiaRestarVaso() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getVasoPequeno().getCantidadDeVasos();
		
		assertEquals(4, resultado);
	}
	
	@Test
	public void deberiaRestarAzucar() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		int resultado = maquinaDeCafe.getAzucar().getCantidadDeAzucar();
		
		assertEquals(17, resultado);
	}
	
	@Test
	public void deberiaDevolverFelicitaciones() {
		
		Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		
		
		assertEquals("Felicitaciones", resultado);
	}
	
 
}
