package ejercicio3B;

public class CreatorTenis extends Creator {
	@Override
	public Elemento create() {
		Tenis tenis = new Tenis();
		tenis.setColor("Morado");
		tenis.setGarantia("4 a�os");
		tenis.setTamano("41");
		return tenis;
	}
}
