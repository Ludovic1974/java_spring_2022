package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_8 {
	public double x = 0, y = 0;

	/**
	 * Realizar un programa que pida al usuario que inserte 2 enteros X e Y por
	 * teclado y realice las operaciones siguientes : Sacar el valor de X y Y en
	 * pantalla realizar la suma combinada de X y de Y. (X+=Y) realizar la resta
	 * combinada de X y de Y. (X-=Y) realizar el producto combinado de X y de Y: (x
	 * *= y) realizar la división combinada de X y de Y: (x /= y) realizar la resta
	 * combinada de X y de Y: (x %= y)
	 */
	public Tarea_C8_8() {
		
		final double X, Y;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduzca el número entero x");
			X = entrada.nextDouble();
			System.out.println("Introduzca el número y");
			Y = entrada.nextDouble();
			if (X == 0 || Y == 0) {
				System.err.println("ERROR: Número nulo.");
				System.exit(-1);
			}
			restablecerValores(X, Y);
			System.out.printf("El valor introducido de x es %.0f y " + "el valor introducido de y es %.0f\n", x, y);
			x += y;			
			System.out.printf("El valor tras la suma combinada de x " + "es %.0f\n", x);
			restablecerValores(X, Y);
			x -= y;
			System.out.printf("El valor tras la resta combinada de x " + "es %.0f\n", x);
			restablecerValores(X, Y);
			x *= y;
			System.out.printf("El valor tras el producto combinado de x " + "es %.0f\n", x);
			restablecerValores(X, Y);
			x /= y;			
			System.out.printf("El valor tras el cociente combinado de x " + "es %.2f\n", x);
			restablecerValores(X, Y);
			x %= y;			
			System.out.printf("El valor tras el resto combinado de x " + "es %.0f\n", x);
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		entrada.close();

	}

	public void restablecerValores(double X, double Y) {
		this.x = X;
		this.y = Y;
	}

}
