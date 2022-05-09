package tareas.b;

import java.util.Scanner;

public class Tarea_B2 {

	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un número:");
		int numero;
		numero = in.nextInt();
		System.out.printf("Raiz de %d = %10.4f",numero , Math.sqrt(numero));

	}
	
	
}
