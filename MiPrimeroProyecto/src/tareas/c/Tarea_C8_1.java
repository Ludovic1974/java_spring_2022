package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_1 {

	/**
	 * Realizar un convertisor monetario que pida al usuario introducir por teclado
	 * el tipo de conversión que desea realizar (Nos limitaremos a conversiones de
	 * Euros a Dolares, Yen y Libras) y la cantidad de dinero que desea cambiar. Al
	 * finalizar las peticiones, el programa realiza las conversiones adecuadas.
	 */
	public Tarea_C8_1() {
		final double DOLAR = 1.13;
		final double YEN = 126.83;
		final double LIBRAS = 0.86;

		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Introduzca la cantidad en EUROS");
			double euros = teclado.nextDouble();
			System.out.println(
					"Introduzca el factor de conversión:\n 1 para cambiar a DOLAR\n2 para cambiar a YEN\n3 para cambiar a LIBRAS.");
			byte conversion = teclado.nextByte();
			if (conversion == 1) {
				double dolar = euros * DOLAR;
				System.out.printf("%.2f euros son %.2f dólares americanos.", euros, dolar);
			} else if (conversion == 2) {
				double yen = euros * YEN;
				System.out.printf("%.2f euros son %.2f yenes japoneses.", euros, yen);
			} else if (conversion == 3) {
				double libras = euros * LIBRAS;
				System.out.printf("%.2f euros son %.2f libras esterlinas.", euros, libras);
			} else {
				System.err.println("ERROR: factor de conversión erróneo");
			}
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

		teclado.close();

	}
}
