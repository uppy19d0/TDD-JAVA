
public class Azucarero {
	private int cantidadDeAzucar;	
	 
	public Azucarero(int cantidadDeAzucar) {
		super();
		this.cantidadDeAzucar = cantidadDeAzucar;
	}

	public void setCantidadDeAzucar(int cantidad) {
		this.cantidadDeAzucar = cantidad;
	}
	
	public int getCantidadDeAzucar() {
		return this.cantidadDeAzucar;
	}
	
	public boolean hasAzucar(int cantidadDeAzucar) {
		
		if (cantidadDeAzucar <= this.cantidadDeAzucar)
			return true;
		return 
			false;
		
	}
	
	public void giveAzucar(int cantidadDeAzucar) {
		
		this.cantidadDeAzucar -= cantidadDeAzucar;
		
	}
}
