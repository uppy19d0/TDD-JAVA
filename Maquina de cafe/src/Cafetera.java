
public class Cafetera {
	private int cantidadCafe;
 
	public Cafetera(int cantidadCafe) {
		super();
		this.cantidadCafe = cantidadCafe;
	}
	
	public void setCantidadDeCafe(int cantidad) {
		this.cantidadCafe = cantidad;
	}
	
	public int getCantidadDeCafe() {
		return this.cantidadCafe;
	}
	
	public boolean hasCafe(int cantidad) {
		
		if(this.cantidadCafe >= cantidad)
			return true;
		else
			return false;
	}
	
	public void giveCafe(int cantidad) {
		this.cantidadCafe -= cantidad;
	}
}
