package ejercicio5B;

public class Terminal3 extends Numero  {

	public Terminal3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("III")) {
			contexto.output = contexto.output + "3 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
