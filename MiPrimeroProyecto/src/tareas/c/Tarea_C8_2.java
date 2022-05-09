package tareas.c;
import java.util.Scanner;

public class Tarea_C8_2 {
	
	int año;
	/**
	 * El programa siguiente tiene que determinar si un año es bisiesto o no.
	 * 
	 * Un año es bisiesto si cumple los siguientes criterios: Es divisible entre 4.
	 * Si termina en 00, debe ser divisible entre 400 (2000 y 2400 son bisiestos)
	 * (2100, 2200 y 2300 no lo son).
	 * 
	 * Desde un enfoque algorítmico, se consideran las proposiciones o enunciados
	 * lógicos siguientes: p: Es divisible entre 4 q: Es divisible entre 100 r: Es
	 * divisible entre 400
	 */
	public Tarea_C8_2() {
		
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un año.");
        año = entrada.nextInt();
        if (año % 4 != 0) {
            System.out.println("El año " + año + " no es bisiesto.");
        } else if (año % 100 != 0) {
            System.out.println("El año " + año + " es bisiesto.");
        } else if (año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        entrada.close();
	}
}
