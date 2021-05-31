package ejercicio5B;

public class terminal1 extends Numero  {

	public terminal1() {
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("I")) {
			contexto.output = contexto.output + "1 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
