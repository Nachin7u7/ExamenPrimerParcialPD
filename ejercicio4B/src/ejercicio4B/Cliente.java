package ejercicio4B;

//		(builder)Se tiene un restaurante que vende platos de Parrillas donde cada plato tiene
//		tipoDeCarne, SaborRefresco, Guarniciones. en este lugar se tienen 3 especialidades : Bife
//		(tipoDeCarne: bife , SaborRefresco: CocaCola, Guarniciones:papasFritas) Lomito(tipoDeCarne:
//		lomo , SaborRefresco: pepsi, Guarniciones:arroz) Tira (tipoDeCarne: tira de carne,
//		SaborRefresco: CocaCola, Guarniciones:fideo) Entran 1 cliente y pide 1 de cada especialidad.

public class Cliente {

	public static void main(String[] args) {

		Parrilla parrilla = new Parrilla();
		Lomito lomo = new Lomito();
		Tira tira = new Tira();
		Bife bife = new Bife();

		parrilla.setBuilderPlato(bife);
		parrilla.preparar();
		parrilla.getBuilderPlato().getPlato();

		parrilla.getBuilderPlato().getPlato().show();

		parrilla.setBuilderPlato(lomo);
		parrilla.preparar();
		parrilla.getBuilderPlato().getPlato();

		parrilla.getBuilderPlato().getPlato().show();

		parrilla.setBuilderPlato(tira);
		parrilla.preparar();
		parrilla.getBuilderPlato().getPlato();

		parrilla.getBuilderPlato().getPlato().show();
		
	}

}
