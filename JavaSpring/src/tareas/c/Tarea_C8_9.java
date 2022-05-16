package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_9 {

	/**
	 * Diseña un programa que solicite un número entero de 5 dígitos, y que diga si
	 * el número es capicua
	 */
	public Tarea_C8_9() {
		double numus = 0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduzca un número entero de cinco cifras.");
			numus = entrada.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		// compruebo si tiene cinco caracteres
		int valabsnumus = (int) Math.abs(numus);
		if (valabsnumus < 10000 || valabsnumus > 100000) {
			System.err.println("ERROR: El número introducido no tiene cinco caracteres.");
		} else if (numus % 1 != 0) { // compruebo que el numero es entero
			System.out.println("El número introducido no es entero");
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
			System.out.println("El número introducido es capicúa.");
		} else {
			System.out.println("El número introducido no es capicúa.");
		}
	}

}
