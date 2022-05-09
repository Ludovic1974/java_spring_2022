package tareas.c;
import java.util.Scanner;

public class Tarea_C8_2 {
	
	int a�o;
	/**
	 * El programa siguiente tiene que determinar si un a�o es bisiesto o no.
	 * 
	 * Un a�o es bisiesto si cumple los siguientes criterios: Es divisible entre 4.
	 * Si termina en 00, debe ser divisible entre 400 (2000 y 2400 son bisiestos)
	 * (2100, 2200 y 2300 no lo son).
	 * 
	 * Desde un enfoque algor�tmico, se consideran las proposiciones o enunciados
	 * l�gicos siguientes: p: Es divisible entre 4 q: Es divisible entre 100 r: Es
	 * divisible entre 400
	 */
	public Tarea_C8_2() {
		
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un a�o.");
        a�o = entrada.nextInt();
        if (a�o % 4 != 0) {
            System.out.println("El a�o " + a�o + " no es bisiesto.");
        } else if (a�o % 100 != 0) {
            System.out.println("El a�o " + a�o + " es bisiesto.");
        } else if (a�o % 400 == 0) {
            System.out.println("El a�o " + a�o + " es bisiesto.");
        } else {
            System.out.println("El a�o " + a�o + " no es bisiesto.");
        }
        entrada.close();
	}
}
