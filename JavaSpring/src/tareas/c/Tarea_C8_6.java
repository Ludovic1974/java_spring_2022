package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_6 {

	/**
	 * El programa tiene que devolver el valor opuesto de un entero insertado por
	 * teclado por el usuario Si el usuario inserta 5 (A), el sistema devuelve -5
	 * (--> -A) si es igual a 0, imprimir un mensaje que diga numero nulo.
	 */
	public Tarea_C8_6() {
		 double a = 0;
	        Scanner entrada = new Scanner(System.in);
	        try {
	        System.out.println("Introduzca el valor A");
	        a = entrada.nextDouble();
	        } catch (InputMismatchException e) {
	        	System.err.println("Error, entrada invalida.");
				System.exit(-1);
	        }
	        if (a == 0) {
	            System.err.println("ERROR: Número nulo.");
	        } else if (a % 1 != 0) {
	            System.err.println("ERROR: El número insertado no es entero.");
	        } else {
	            double b=Math.abs(a);
	            System.out.printf("El valor absoluto de %.0f es %.0f\n",a,b);
	        }
	}

}
