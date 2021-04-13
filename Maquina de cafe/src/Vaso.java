
public class Vaso {
	
	private int cantidadVasos;
	private int contenido;
	
	public Vaso(int cantidadVasos, int contenido) {
		super();
		this.cantidadVasos = cantidadVasos;
		this.contenido = contenido;
	}
	
	public boolean hasVasos(int cantidad) {
		
		return cantidad<=this.cantidadVasos?true:false;
		
	}
	 
	public void giveVasos(int cantidad) {
		this.cantidadVasos -= cantidad;
	}
	
	public int getCantidadDeVasos() {
		return this.cantidadVasos;
	}
	
	public int getContenido() {
		return this.contenido;
	}
	
	public void setCantidadVasos(int cantidad) {
		this.cantidadVasos = cantidad;
	}
	
	
	
	
}
