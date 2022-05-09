package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C6_2 {
	/**
	 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
	 * siguiente manera: Si trabaja 40 horas o menos se le paga 16 € / hora Si
	 * trabaja más de 40 horas se le paga 16 € por cada una de las primeras 40 horas
	 * y 20 € por cada hora extra.
	 */
	public static void ejecutaEjercicio() {
		int horas, sueldo;	
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("¿Cúantas horas ha trabajado el obrero?");
			horas = teclado.nextInt();

			if (horas > 40) {
				sueldo = horas * 16 + (horas - 40) * 4;
//				sueldo = 40 * 16 + (horas - 40) * 20;
			} else {
				sueldo = horas * 16;
			}

			System.out.println("El sueldo es de " + sueldo + " euros.");
			

		} catch (InputMismatchException e) {
			System.out.println("Error, entrada invalida.");
			System.exit(-1);
		}

		teclado.close();
		
	}
}
