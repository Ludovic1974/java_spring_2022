package miprimerproyecto.e.recursividad;

public class MainRecursividad {

	public static void main(String[] args) {
		/*
		 * En general, la recursividad es el proceso de definir algo en t�rminos de s�
		 * mismo y es algo similar a una definici�n circular. El componente clave de un
		 * m�todo recursivo es una declaraci�n que ejecuta una llamada a s� mismo. La
		 * recursividad es un poderoso mecanismo de control.
		 */

		Factorial f = new Factorial();
		System.out.println("Factorial utilizando un m�todo recursivo:");
		System.out.println("El factorial de 3 es: " + f.facR(3));
		System.out.println("El factorial de 6 es: " + f.facR(6));
		System.out.println();
		System.out.println("Factorial utilizando un m�todo iterativo:");
		System.out.println("El factorial de 3 es: " + f.facI(3));
		System.out.println("El factorial de 6 es: " + f.facI(6));
		System.out.println();

		/*
		 * Las versiones recursivas de muchas rutinas pueden ejecutarse un poco m�s
		 * lentamente que sus equivalentes iterativos debido a la sobrecarga adicional
		 * de las llamadas a m�todos adicionales. Demasiadas llamadas recursivas a un
		 * m�todo podr�an causar un desbordamiento de la pila.
		 * 
		 * Como el almacenamiento para los par�metros y las variables locales est� en la
		 * pila y cada llamada nueva crea una nueva copia de estas variables, es posible
		 * que la pila se haya agotado. Si esto ocurre, el sistema de tiempo de
		 * ejecuci�n (run-time) de Java causar� una excepci�n. Sin embargo,
		 * probablemente no tendr�s que preocuparte por esto a menos que una rutina
		 * recursiva se vuelva loca.
		 * 
		 * La principal ventaja de la recursividad es que algunos tipos de algoritmos se
		 * pueden implementar de forma m�s clara y m�s recursiva de lo que pueden ser
		 * iterativamente. Por ejemplo, el algoritmo de clasificaci�n Quicksort es
		 * bastante dif�cil de implementar de forma iterativa. Adem�s, algunos
		 * problemas, especialmente los relacionados con la IA, parecen prestarse a
		 * soluciones recursivas.
		 * 
		 * https://javadesdecero.es/intermedio/recursividad-con-ejemplos/
		 */

	}

}
