package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_4 {

	/**
	 * El programa tiene que determinar el grado conseguido basándonos sobre el
	 * resultado obtenido. El resultado está leído por teclado y el grado calculado
	 * según las condiciones siguientes:
	 * 
	 * Resultado Grado 90-100 A 80-89 B 70-79 C 50-69 D 0-49 E
	 */
	public Tarea_C8_4() {
		int resultado = 0; 
		Scanner entrada = new Scanner(System.in);
		try {
        System.out.println("Introduzca un resultado entre 0 y 100");
        resultado = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

        if (resultado >= 0 && resultado < 50) {
            System.out.println("El resultado introducido es de grado E");

        } else if (resultado >= 50 && resultado < 70) {
            System.out.println("El resultado introducido es de grado D");

        } else if (resultado >= 70 && resultado < 80) {
            System.out.println("El resultado introducido es de grado C");

        } else if (resultado >= 80 && resultado < 90) {
            System.out.println("El resultado introducido es de grado B");

        } else if (resultado >= 90 && resultado < 100) {
            System.out.println("El resultado introducido es de grado A");

        } else {
            System.out.println("El resultado introducido no está entre 0 y 100");

        }
        entrada.close();
	}
}
