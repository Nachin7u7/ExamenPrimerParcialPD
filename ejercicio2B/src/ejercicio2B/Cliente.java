package ejercicio2B;

//		En una fábrica de celulares se crea un nuevo celular que tiene : modelo,
//		tamaño, peso, cámara (foco,lente) , imei, origen. El primer celular : modelo=A1 , Peso=60 ,
//		Cámara (foco=10,lente= 5mp) imei=10001 , paisCreado= Bolivia, En esta tienda se desea tener
//		el registro de 5 celulares donde el lo que cambia en el imei 10002 , 10003.

public class Cliente {

	public static void main(String[] args) {

		Celular celular1 = new Celular();
		Celular celular2 = new Celular();
		Celular celular3 = new Celular();
		Celular celular4 = new Celular();
		Celular celular5 = new Celular();

		celular1.setTamano("10plg");
		celular2.setTamano("5plg");
		celular3.setTamano("12plg");
		celular4.setTamano("6plg");
		celular5.setTamano("7plg");

		celular1.setImei("10001");
		celular2.setImei("10002");
		celular3.setImei("10003");
		celular4.setImei("10004");
		celular5.setImei("10005");

		celular1.setModelo("A1");
		celular2.setModelo("A2");
		celular3.setModelo("J1");
		celular4.setModelo("J2");
		celular5.setModelo("Core2");

		celular1.setOrigen("Bolivia");
		celular2.setOrigen("Japon");
		celular3.setOrigen("Russia");
		celular4.setOrigen("USA");
		celular5.setOrigen("Chile");

		celular1.setPeso("60");
		celular2.setPeso("50");
		celular3.setPeso("55");
		celular4.setPeso("40");
		celular5.setPeso("70");

		celular1.setCamara(new Camara("10", "5mp"));
		celular2.setCamara(new Camara("9", "5mp"));
		celular3.setCamara(new Camara("11", "6mp"));
		celular4.setCamara(new Camara("12", "6mp"));
		celular5.setCamara(new Camara("15", "4mp"));

		celular1.show();
		celular2.show();
		celular3.show();
		celular4.show();
		celular5.show();

	}

}
