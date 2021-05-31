package ejercicio2B;

public class Camara {

	public Camara(String foco, String lente) {
		super();
		this.foco = foco;
		this.lente = lente;
	}

	String foco;
	String lente;

	public String getFoco() {
		return foco;
	}

	public void setFoco(String foco) {
		this.foco = foco;
	}

	public String getLente() {
		return lente;
	}

	public void setLente(String lente) {
		this.lente = lente;
	}

	public void showData() {
		System.out.println("Foco de camara: " + foco);
		System.out.println("Lente de camara: " + lente);
	}

}
