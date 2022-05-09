package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_5 {

	/**
	 * El programa tiene que devolver el inverso de un entero insertado 
	 * por teclado
	 * por el usuario Si el usuario inserta 5 (A=5), el sistema devuelve 
	 * 0.20 (1/A) 
	 * si es igual a 0, imprimir un mensaje que diga número nulo.
	 */
	public Tarea_C8_5() {
		double input = 0; 
		Scanner entrada = new Scanner(System.in);
		try {
        System.out.println("Introduzca un número entero");
        input = entrada.nextDouble();
		} 
		catch (InputMismatchException e){
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		

        if (input == 0) {
            System.err.println("ERROR: Número nulo");
        } else if (input % 1 != 0) {
            System.err.println("ERROR:El número introducido no es entero");
        } else {
            double inv=1/input;
            System.out.printf("El inverso del número %.0f es %f", input, inv);
        }
        entrada.close();
	}

}
