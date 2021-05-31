package ejercicio4B;

public class Bife extends BuildPlato {

	@Override
	public void buildTipoCarne() {
		plato.setTipoCarne("Bife");
	}

	@Override
	public void buildSaborRefresco() {
		plato.setSaborRefresco("CocaCola");
	}

	@Override
	public void buildGuarniciones() {
		plato.setGuarniciones("PapasFritas");
	}

}
