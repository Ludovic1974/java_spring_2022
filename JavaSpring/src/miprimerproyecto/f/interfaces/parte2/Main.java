package miprimerproyecto.f.interfaces.parte2;

public class Main {
	/*
	 * Herencia H�brida (a trav�s de Interfaces): Es una mezcla de dos o m�s de los
	 * tipos de herencia anteriores. Como Java no admite herencia m�ltiple con
	 * clases, la herencia h�brida tampoco es posible con clases. En Java, podemos
	 * lograr herencia h�brida solo a trav�s de Interfaces.
	 */
	// Fuente: https://javadesdecero.es/poo/herencia-java-tipos-ejemplos/
	
	public static void main(String[] args) {
		System.out.println("****************HERENCIA H�BRIDA****************************");
		
		// 1 a 9 Telefono
		// 10 Calculadora
		// 11 a 15 Telefono
		// 16 Main
		// hacemos un ejemplo de telefono para ver qu� pasa
//		Telefono telefonoBasico = new Telefono("SuperFone2100", "Huaaawei", 645789987);
//		System.out.println(telefonoBasico);
		// 17 Main: Qu� haremos?
		// Haremos una nueva interfaz internet pero esta vez
		// Vamos a intentar usarla de otra forma
		// Vamos a crear una interfaz y una clase que la implemente
		// y despu�s accederemos a ella desde el tel�fono
		// 18 a 19 Internet
		// 20 a 21 CincoG
		// 22 Telefono
		// 28 comentamos las primeras l�neas de c�digo
		// 29 creamos un objeto nuevo con el 5G y otro con nuevo constructor
		// en �l incluimos la 5G
		CincoG cincoG = new CincoG();
		Telefono telefonoConInternet = new Telefono("SuperFone2100", "Huaaawei", 645789987, cincoG);
		System.out.println(telefonoConInternet);
		CandyCrush cc = new CandyCrush(); 
		Samsung a52s = new Samsung("A52s", "Samsung", 648741741, cincoG, cc);
		System.out.println(a52s);
		
		

	}

}
