package ejercicio3B;

//		Se desea tener una forma fácil de crear específicos Elementos de una
//		tienda deportiva donde se define el precio al momento de venderlo luego de instanciarlo, los
//		elementos deportivos son, PelotaFutbol (tamano, color, garantia), Camiseta, Shorts, Medias,
//		Tenis. se desea instanciar 1 de cada 1

public class Cliente {

	public static void main(String[] args) {
		
		//CREANDO ELEMENTOS
		CreatorCamiseta camiseta = new CreatorCamiseta();
		camiseta.create().setColor("Amarillo");
		camiseta.create().crear();

		CreatorMedias medias = new CreatorMedias();
		medias.create().crear();

		CreatorPelota pelota = new CreatorPelota();
		pelota.create().crear();

		CreatorShorts shorts = new CreatorShorts();
		shorts.create().crear();

		CreatorTenis tenis = new CreatorTenis();
		tenis.create().crear();
		
		//CREANDO UNA CAMISA AMARILLA
		Camiseta camisa = (Camiseta) new CreatorCamiseta().create();
		camisa.setColor("amarillo");
		camisa.crear();
	}

}
