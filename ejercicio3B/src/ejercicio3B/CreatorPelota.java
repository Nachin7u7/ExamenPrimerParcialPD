package ejercicio3B;

public class CreatorPelota extends Creator {

	@Override
	public Elemento create() {
		PelotaFutbol pelota = new PelotaFutbol();
		pelota.setColor("Negro");
		pelota.setGarantia("2 a�os");
		pelota.setTamano("Mediano");
		return pelota;
	}

}
