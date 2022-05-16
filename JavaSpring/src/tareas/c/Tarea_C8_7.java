package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_7 {
	/**
	 * Realizar un programa que pida al usuario que inserte 2 enteros X e Y por
	 * teclado y que analice su entrada por teclado. El analísis tiene que indicar
	 * al usuario si los dos números son iguales o distintos Y en caso de ser
	 * distintos, si X es más grande o más pequeño que Y
	 */
	public Tarea_C8_7() {
		double x = 0, y = 0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduzca el número entero x");
			x = entrada.nextDouble();
			System.out.println("Introduzca el número y");
			y = entrada.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

		if (x == y) {
			System.out.println("Números iguales.");
		} else if (x < y) {
			System.out.println("X es menor que Y");
		} else {
			System.out.println("X es mayor que Y");
		}

		entrada.close();
	}

}
