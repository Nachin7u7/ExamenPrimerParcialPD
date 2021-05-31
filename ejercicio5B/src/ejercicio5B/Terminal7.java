package ejercicio5B;

public class Terminal7 extends Numero  {

	public Terminal7() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("VII")) {
			contexto.output = contexto.output + "7 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
