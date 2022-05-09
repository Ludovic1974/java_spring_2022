package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_7 {
	/**
	 * Realizar un programa que pida al usuario que inserte 2 enteros X e Y por
	 * teclado y que analice su entrada por teclado. El anal�sis tiene que indicar
	 * al usuario si los dos n�meros son iguales o distintos Y en caso de ser
	 * distintos, si X es m�s grande o m�s peque�o que Y
	 */
	public Tarea_C8_7() {
		double x = 0, y = 0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduzca el n�mero entero x");
			x = entrada.nextDouble();
			System.out.println("Introduzca el n�mero y");
			y = entrada.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

		if (x == y) {
			System.out.println("N�meros iguales.");
		} else if (x < y) {
			System.out.println("X es menor que Y");
		} else {
			System.out.println("X es mayor que Y");
		}

		entrada.close();
	}

}
