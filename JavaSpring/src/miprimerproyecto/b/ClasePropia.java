package miprimerproyecto.b;

import java.util.*;

public class ClasePropia {

	public static void main(String[] args) {

		// Declarar un objeto e inicializar con
		// el objeto de entrada est�ndar predefinido
		Scanner s = new Scanner(System.in);
		System.out.println("Como te llamas?");
		// entrada de una cadena
		String nombre = s.nextLine();
		// entrada de un car�cter
		System.out.println("Introduce tu genero por favor");
		char gender = s.next().charAt(0);
		// System.out.println(nombre);
		System.out.println("Introduce tu edad por favor");
		// Entrada de datos num�ricos
		// byte, short y float
		int edad = s.nextInt();
		System.out.println("Introduce tu tel�fono");
		long movilNo = s.nextLong();

		System.out.println("Hola " + nombre + " el a�o que "
				+ "viene tendr�s " + (edad + 1) + " a�os.");
		// Imprima los valores para verificar si la entrada
		// fue obtenida correctamente.

		System.out.println("G�nero: " + gender);
		System.out.println("Tel�fono: " + movilNo);
	
	

		double raiz = Math.sqrt(9);
		System.out.println(raiz);

//		double base = 15;
//		double exponente = 8; 
//		double resultado = Math.pow(base, exponente);
		// System.out.println(resultado);

		double num1 = 5.85;
		int num2 = (int) Math.ceil(num1);

		System.out.println("Si redondeamos " + num1 + " obtenemos un " + num2 + ".");

		float x = 4567.9874f;
		//los n�meros con tipo de dato FLOAT pueden perder precisi�n
		//https://docs.microsoft.com/en-us/cpp/build/why-floating-point-numbers-may-lose-precision?view=msvc-170
		System.out.println("Probando a redondear un float " +Math.round(x));

		double base = 15;
		double exponente = 8;
		int resultado = (int) Math.pow(base, exponente);
		System.out.println(resultado);
		// Ojo con los l�mites de cada tipo de dato
		// No hacerlo puede llevar a tener sorpresas
		// l�mite de int 2147483647 imprimido
		// resultado real obtenido 2562890625

	}

}
