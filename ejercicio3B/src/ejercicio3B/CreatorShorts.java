package ejercicio3B;

public class CreatorShorts extends Creator {
	@Override
	public Elemento create() {
		Shorts shorts = new Shorts();
		shorts.setColor("Azul");
		shorts.setGarantia("1 año");
		shorts.setTamano("38");
		return shorts;
	}
}
