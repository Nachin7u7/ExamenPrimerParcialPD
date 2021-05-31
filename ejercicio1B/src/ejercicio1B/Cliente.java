package ejercicio1B;

//	cuando un estudiante (nombre,ci) desea matricularse en su colegio
//	necesita realizar un depósito en la ventanilla única donde se ingresan los datos del estudiante
//	en un objeto que almacena estudiantes y se guarda la hora actual cuando se realizó la
//	matriculación, el jefe de recursos humanos puede consultar cuántos estudiantes están
//	matriculados mostrando los datos de cada estudiante, hora de matriculación y saber el monto
//	que tiene la ventanilla en ese momento, se desean inscribir 4 estudiantes al mismo tiempo
//	donde el estudiante 1 y 4 tienen los mismos datos (no debe existir duplicados).

public class Cliente {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante estudiante = new Estudiante();
				estudiante.setCi(10923816);
				estudiante.setNombre("Ignacio");
				singleton.pagar(estudiante, "16:00", 1200);
				singleton.mostrarInfo();
				System.out.println("");
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante estudiante5 = new Estudiante();
				estudiante5.setCi(2653477);
				estudiante5.setNombre("Jorge");
				singleton.pagar(estudiante5, "17:00", 1600);
				singleton.mostrarInfo();
				System.out.println("");

			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante estudiante2 = new Estudiante();
				estudiante2.setCi(12141556);
				estudiante2.setNombre("Juan");
				singleton.pagar(estudiante2, "10:00", 1000);
				singleton.mostrarInfo();
				System.out.println("");

			}
		});
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				PagoMatricula singleton = PagoMatricula.getInstance();
				Estudiante estudiante3 = new Estudiante();
				estudiante3.setCi(12171816);
				estudiante3.setNombre("Pedro");
				singleton.pagar(estudiante3, "12:00", 2000);
				singleton.mostrarInfo();
				System.out.println("");

			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
