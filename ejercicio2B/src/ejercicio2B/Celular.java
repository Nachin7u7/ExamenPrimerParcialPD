package ejercicio2B;

public class Celular implements ICelular {

	public Celular() {
	}

	String modelo;
	String tamano;
	String peso;
	Camara camara;
	String imei;
	String origen;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public Object clone() {
		Celular celular = new Celular();
		celular.setCamara(this.camara);
		celular.setImei(this.imei);
		celular.setModelo(this.modelo);
		celular.setOrigen(this.origen);
		celular.setPeso(this.peso);
		celular.setTamano(this.tamano);
		return celular;
	}

	public void show() {
		System.out.println("Imei: " + imei);
		System.out.println("Modelo: " + modelo);
		System.out.println("Origen: " + origen);
		System.out.println("Peso: " + peso);
		System.out.println("Tamano: " + tamano);
		camara.showData();
		System.out.println("");
	}

}
