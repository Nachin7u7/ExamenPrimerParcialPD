package ejercicio3B;

public class CreatorCamiseta extends Creator {
	@Override
	public Elemento create() {
		Camiseta camiseta = new Camiseta();
		camiseta.setColor("Rojo");
		camiseta.setGarantia("1 a�o");
		camiseta.setTamano("L");
		return camiseta;
	}
}
