package ejercicio5B;

public class Terminal2 extends Numero  {

	public Terminal2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("II")) {
			contexto.output = contexto.output + "2 ";
			contexto.input = contexto.input.substring(1);
		}
	}
	
}
