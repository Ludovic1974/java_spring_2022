package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tarea_C6_1 {
	/**
	 * En el Mercado se hace un 20% de descuento a los clientes cuya compra 
	 * supera los 300 € 
	 * ¿Cuál será la cantidad que pagará una persona por su compra? 
	 * @author Ludovic Laisnez
	 */
	public static void ejecutaEjercicio() {
		float compra;
		float descuento = 20f; 
		Scanner teclado = new Scanner(System.in);
		try {			
			System.out.println("¿Cúal ha sido la cantidad comprada por el cliente?");
			compra = teclado.nextFloat();

			if (compra > 300) {
				compra = compra - (compra * descuento / 100);
			}

			System.out.printf("El cliente ha pagado %.2f euros", compra);
			
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}
		
		teclado.close();
		
	}

}
