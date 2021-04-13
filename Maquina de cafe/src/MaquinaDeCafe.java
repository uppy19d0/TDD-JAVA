
public class MaquinaDeCafe {
	private Cafetera cafetera;
	private Vaso vasoPequeno;
	private Vaso vasoMediano;
	private Vaso vasoGrande;
	private Azucarero azucar;
	 
	public Vaso getTipoVaso(String tipoDeVaso) {
		
		if(tipoDeVaso.equals("pequeno"))
			return this.vasoPequeno;
		else if(tipoDeVaso.equals("mediano"))
			return this.vasoMediano;
		else
			return this.vasoGrande;
		
	}
	
	public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
		
		if(tipoDeVaso.getCantidadDeVasos() <= cantidadDeVasos)
			return "No hay vasos";
		
		int cantidadTotalCafe = tipoDeVaso.getContenido()* cantidadDeVasos;
		
		if(cantidadTotalCafe > this.cafetera.getCantidadDeCafe())
			return "No hay cafe";
		
		if(cantidadDeAzucar > this.azucar.getCantidadDeAzucar())
			return "No hay azucar";
		
		this.cafetera.setCantidadDeCafe(this.cafetera.getCantidadDeCafe() - cantidadTotalCafe);
		tipoDeVaso.setCantidadVasos(tipoDeVaso.getCantidadDeVasos() - cantidadDeVasos);
		this.azucar.setCantidadDeAzucar(this.getAzucar().getCantidadDeAzucar() - cantidadDeAzucar);
		
		return "Felicitaciones";
		
	}

	public Cafetera getCafetera() {
		return cafetera;
	}

	public void setCafetera(Cafetera cafetera) {
		this.cafetera = cafetera;
	}

	public Vaso getVasoPequeno() {
		return vasoPequeno;
	}

	public void setVasoPequeno(Vaso vasoPequeno) {
		this.vasoPequeno = vasoPequeno;
	}

	public Vaso getVasoMediano() {
		return vasoMediano;
	}

	public void setVasoMediano(Vaso vasoMediano) {
		this.vasoMediano = vasoMediano;
	}

	public Vaso getVasoGrande() {
		return vasoGrande;
	}

	public void setVasoGrande(Vaso vasoGrande) {
		this.vasoGrande = vasoGrande;
	}

	public Azucarero getAzucar() {
		return azucar;
	}

	public void setAzucar(Azucarero azucar) {
		this.azucar = azucar;
	}
	
	
	
	
}
