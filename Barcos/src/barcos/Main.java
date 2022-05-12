package barcos;

public class Main {

	public static void main(String[] args) {

		Barco barco1 = new Barco();
		Barco barco2 = new Barco("Barco de Mobydick", 1500, 300, (byte) 3, 0, 1500);
		Barco barco3 = new Barco(15000, 70000, 5000);
		System.out.println("Antes de cambiar la altura : " + barco2.getAltura());
		barco2.setAltura(400);
		System.out.println("Después de cambiar la altura : " + barco2.getAltura());

//		System.out.println(barco1.obtenerDatos());
		System.out.println(barco2.obtenerDatos());
//		System.out.println(barco3.obtenerDatos());

		Barco barcos[] = { barco1, barco2, barco3 };
		// barco 1 -> 600 de ancho /500 de alto / PEQUEÑO
		// barco 2 -> 1500 de ancho /1500 de alto / GRANDE
		// barco 3 -> 15000 de ancho /5000 de alto / ENORME
		for (Barco barco : barcos) {
			System.out.println(barco.obtenerDatos());
			System.out.println("*************************************");
			if (barco.anchoInferiorA(700)==true && barco.alturaInferiorA(600)==true) {// puente de 700cm/600cm
				System.out.println("El " + barco.getNombre() + " pasa el puente pequeño");
			} else if (barco.anchoInferiorA(2000)==true && barco.alturaInferiorA(5000)==true) { // puente de 2000cm/5000cm
				System.out.println("El " + barco.getNombre() + " pasa el segundo puente");
			} else if (barco.anchoInferiorA(10000)==true && barco.alturaInferiorA(10000)==true) {// puente de 10000cm/10000cm
				System.out.println("El " + barco.getNombre() + " pasa los tres puentes");
			} else {
				System.out.println("El " + barco.getNombre() + " no pasa ningun puente");
			}
			System.out.println("*************************************");

		}

	}

}
