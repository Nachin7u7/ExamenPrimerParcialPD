package ejercicio5B;

public class Terminal6 extends Numero  {

	public Terminal6() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("VI")) {
			contexto.output = contexto.output + "6 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
