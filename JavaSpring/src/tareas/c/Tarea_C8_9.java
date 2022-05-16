package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_9 {

	/**
	 * Dise�a un programa que solicite un n�mero entero de 5 d�gitos, y que diga si
	 * el n�mero es capicua
	 */
	public Tarea_C8_9() {
		double numus = 0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduzca un n�mero entero de cinco cifras.");
			numus = entrada.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		// compruebo si tiene cinco caracteres
		int valabsnumus = (int) Math.abs(numus);
		if (valabsnumus < 10000 || valabsnumus > 100000) {
			System.err.println("ERROR: El n�mero introducido no tiene cinco caracteres.");
		} else if (numus % 1 != 0) { // compruebo que el numero es entero
			System.out.println("El n�mero introducido no es entero");
		} else if (numus < 0) {
			numus = -numus;
			sacaResultado(numus);
		} else {
			sacaResultado(numus);
		}
		entrada.close();
	}

	public void sacaResultado(double numus) {
		String numusuario = Double.toString(numus);
		char uno = numusuario.charAt(0);
		char dos = numusuario.charAt(1);
		char tres = numusuario.charAt(2);
		char cuatro = numusuario.charAt(3);
		char cinco = numusuario.charAt(4);
		int primero = uno - 0;
		int segundo = dos - 0;
		int tercero = tres - 0;
		int cuarto = cuatro - 0;
		int quinto = cinco - 0;

		if (primero == quinto && segundo == cuarto) {
			System.out.println("El n�mero introducido es capic�a.");
		} else {
			System.out.println("El n�mero introducido no es capic�a.");
		}
	}

}
