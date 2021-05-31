package ejercicio4B;

public class Parrilla {
	private BuildPlato builderPlato;

	public BuildPlato getBuilderPlato() {
		return builderPlato;
	}

	public void setBuilderPlato(BuildPlato builderPlato) {
		this.builderPlato = builderPlato;
	}

	public void preparar() {
		this.builderPlato.createPlato();
		this.builderPlato.buildGuarniciones();
		this.builderPlato.buildSaborRefresco();
		this.builderPlato.buildTipoCarne();
	}

}
