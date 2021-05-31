package ejercicio5B;

public class Terminal8 extends Numero  {

	public Terminal8() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("VIII")) {
			contexto.output = contexto.output + "8 ";
			contexto.input = contexto.input.substring(1);
		}
	}
}
