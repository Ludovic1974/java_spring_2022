package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C7_2 {	
	
	/**
	 * Se solicita leer un número entero positivo y 
	 * determinar si es un número de 1,
	 * 2,3 o 4 cifras. 
	 * En esta versión del ejercicio, utilizo una estructura if else
	 * Aunque en la realidad, para este tipo de ejercicio, haría falta 
	 * utilizar algo
	 * más rápido
	 * 
	 * @author Ludovic Laisnez
	 */
	public Tarea_C7_2() {		
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Introduzca un número de 1 a 100000");
			num = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		teclado.close();		
	}
	
	public int num; //puede ser estático

	public void ejecutaEjercicioVersionMala() {

		if (num > 0 && num < 10) {
			System.out.println("el número es de 1 cifra");
		} else if (num >= 10 && num < 100) {
			System.out.println("el número es de 2 cifras");
		} else if (num >= 100 && num < 1000) {
			System.out.println("el número es de 3 cifras");
		} else if (num >= 1000 && num < 10000) {
			System.out.println("el número es de 4 cifras");
		} else if (num >= 10000 && num < 100000) {
			System.out.println("el número es de 5 cifras");
		} else {
			System.err.println("Este número no está permitido");
		}

	}

	public void ejecutaConLog10() {

		System.out.println("Con Log10, es un número "
				+ "de " + (int) Math.floor(Math.log10(num) + 1) + " cifras");

	}
	
	public void ejecutaConWhile() {
		int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        System.out.println("Con un bucle WHILE, es un "
        		+ "número de " + count + " cifras");
	}

	public void ejecutaConToString() {

		String dig = Integer.toString(num);
		System.out.println("Con toString, es un número "
				+ "de " + dig.length() + " cifras");
	}
	
	
}
