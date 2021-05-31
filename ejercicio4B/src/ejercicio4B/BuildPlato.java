package ejercicio4B;

public abstract class BuildPlato {

	Plato plato;

	public Plato getPlato() {
		return plato;
	}

	public void createPlato() {
		plato = new Plato();
	}

	public abstract void buildTipoCarne();

	public abstract void buildSaborRefresco();

	public abstract void buildGuarniciones();

}
