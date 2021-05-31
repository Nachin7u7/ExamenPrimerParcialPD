package ejercicio5B;

public class Terminal4 extends Numero  {

	public Terminal4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("IV")) {
			contexto.output = contexto.output + "4 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
