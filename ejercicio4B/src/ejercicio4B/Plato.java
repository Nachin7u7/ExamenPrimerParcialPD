package ejercicio4B;

public class Plato {

	public Plato() {
	}

	String tipoCarne;
	String saborRefresco;
	String guarniciones;

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getSaborRefresco() {
		return saborRefresco;
	}

	public void setSaborRefresco(String saborRefresco) {
		this.saborRefresco = saborRefresco;
	}

	public String getGuarniciones() {
		return guarniciones;
	}

	public void setGuarniciones(String guarniciones) {
		this.guarniciones = guarniciones;
	}

	public void show() {
		System.out.println("Tipo de carne: " + tipoCarne);
		System.out.println("Refresco: " + saborRefresco);
		System.out.println("Guarniciones: " + guarniciones);
		System.out.println("");
	}
}
