package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_3 {
	/**
	 * Recuperamos los datos del usuario y los manipulamos: Dise�a un programa que
	 * solicite un n�mero entero de 5 d�gitos, separe el n�mero en sus d�gitos
	 * individuales y los muestre por pantalla
	 */
//	public Tarea_C8_3() {
//		double numus = 0;
//		Scanner entrada = new Scanner(System.in);
//		try {
//			System.out.println("Introduzca un n�mero entero de cinco cifras.");
//			numus = entrada.nextDouble();
//		} catch (InputMismatchException e) {
//			System.err.println("Error, entrada invalida.");
//			System.exit(-1);
//		}
//		// compruebo si tiene cinco caracteres
//		int valabsnumus = (int) Math.abs(numus);
//		if (valabsnumus < 10000 || valabsnumus > 10000) {
//			System.err.println("ERROR: El n�mero introducido no tiene cinco caracteres.");
//		} else if (numus % 1 != 0) { // compruebo que el numero es entero
//			System.out.println("El n�mero introducido no es entero");
//		} else if (numus < 0) {
//
//			numus = numus * -1; // si es negativo lo cambio de signo para obtener las cifras por orden.
//			impresion(numus);
//
//		} else {
//			impresion(numus);
//
//		}
//		entrada.close();
//
//	}

	public static void impresion(double numus) {
		String numusu = Double.toString(numus);

		char uno = numusu.charAt(0);
		char dos = numusu.charAt(1);
		char tres = numusu.charAt(2);
		char cuatro = numusu.charAt(3);
		char cinco = numusu.charAt(4);
		System.out.printf(
				"La primera cifra del n�mero es %c\nLa segunda cifra del n�mero es %c\nLa tercera cifra del n�mero es %c\nLa cuarta cifra del n�mero es %c\nLa quinta cifra del n�mero es %c",
				uno, dos, tres, cuatro, cinco);
	}
}
