package ejercicio5B;

public class Terminal5 extends Numero  {

	public Terminal5() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void interpreter(ContextoNumeroEntero contexto) {
		if (contexto.input.startsWith("V")) {
			contexto.output = contexto.output + "5 ";
			contexto.input = contexto.input.substring(1);
		}
	}

}
