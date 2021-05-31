package ejercicio5B;

public class Terminal10 extends Numero {

	public Terminal10() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("X")) {
			contexto.output = contexto.output + "10 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
