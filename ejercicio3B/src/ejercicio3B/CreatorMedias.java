package ejercicio3B;

public class CreatorMedias extends Creator {
	@Override
	public Elemento create() {
		Medias medias = new Medias();
		medias.setColor("Blanco");
		medias.setGarantia("1 a�o");
		medias.setTamano("Largas");
		return medias;
	}
}
