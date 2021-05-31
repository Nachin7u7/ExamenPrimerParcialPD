package ejercicio5B;

import java.util.ArrayList;
import java.util.List;

public class NoTerminal extends Numero {

	private List<Numero> parseTree = new ArrayList<>();
	private ContextoNumeroEntero contexto;

	public NoTerminal() {
//		this.interpreter(contexto);
	}

	public void interpretacion(String word) {
		String input = word;
		contexto = new ContextoNumeroEntero(input.replace(" ", ""));
		for (String words : input.split(" ")) {
			switch (words) {
			case "I": {
				parseTree.add(new terminal1());
				break;
			}
			case "II": {
				parseTree.add(new Terminal2());
				break;
			}
			case "III": {
				parseTree.add(new Terminal3());
				break;
			}
			case "IV": {
				parseTree.add(new Terminal4());
				break;
			}
			case "V": {
				parseTree.add(new Terminal5());
				break;
			}
			case "VI": {
				parseTree.add(new Terminal6());
				break;
			}
			case "VII": {
				parseTree.add(new Terminal7());
				break;
			}
			case "VIII": {
				parseTree.add(new Terminal8());
				break;
			}
			case "IX": {
				parseTree.add(new Terminal9());
				break;
			}
			case "X": {
				parseTree.add(new Terminal10());
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + words);
			}
		}
	}

	@Override
	public void interpreter(ContextoNumeroEntero context) {

	}

}
