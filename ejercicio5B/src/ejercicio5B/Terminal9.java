package ejercicio5B;

public class Terminal9 extends Numero  {

	public Terminal9() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("IX")) {
			contexto.output = contexto.output + "9 ";
			contexto.input = contexto.input.substring(1);
		}
	}
	
}
