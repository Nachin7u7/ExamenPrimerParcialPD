package ejercicio4B;

public class Tira extends BuildPlato {

	@Override
	public void buildTipoCarne() {
		plato.setTipoCarne("Tira de Carne");
	}

	@Override
	public void buildSaborRefresco() {
		plato.setSaborRefresco("CocaCola");
	}

	@Override
	public void buildGuarniciones() {
		plato.setGuarniciones("Fideo");
	}

}
