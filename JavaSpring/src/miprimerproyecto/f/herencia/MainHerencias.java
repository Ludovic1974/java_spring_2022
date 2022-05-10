package miprimerproyecto.f.herencia;

import java.util.ArrayList;
import java.util.Arrays;

import miprimerproyecto.f.herencia.herencia_jerarquica.Burmes;
import miprimerproyecto.f.herencia.herencia_jerarquica.GatoComun;
import miprimerproyecto.f.herencia.herencia_multinivel.Jefe;
import miprimerproyecto.f.herencia.herencia_unica.Gato;
import miprimerproyecto.f.herencia.herencia_unica.Siames;
import miprimerproyecto.f.sobrecarga.Animal;

/*
 * 1
 * La herencia es un pilar importante de la Programaci�n Orientada a Objetos. 
 * Es el mecanismo en Java por el cual una clase permite heredar las caracter�sticas 
 * (atributos y m�todos) de otra clase pudiendo al mismo tiempo a�adir atributos y 
 * m�todos propios. 
 * Inter�s: 
 * Reutilizaci�n del c�digo.
 * Mantenimiento de aplicaciones existentes.
 * */
class MainHerencias {
	/*
	 * 2 Cuando se crea un objeto de clase Triangulo, una copia de todos los m�todos
	 * y campos de la superclase adquiere memoria en este objeto. Es por eso que, al
	 * usar el objeto de la subclase, tambi�n podemos acceder a los miembros de una
	 * superclase.
	 */
	public static void main(String[] args) {
		System.out.println("****************HERENCIA****************************");

		// 3 DosDimensiones
		// 4 Triangulo
		// 5 A 9 DosDimensiones
		// 10 A 14 Triangulo
		// 15 A 16 MainHerencias
		Triangulo t1 = new Triangulo();
		t1.setBase(4.0);
		t1.setAltura(4.0);
		t1.setEstilo("Tri�ngulo is�scele");
		Triangulo t2 = new Triangulo("Tri�ngulo equilatero", 12.0, 8.0);
		// 16
		System.out.println("Informaci�n para T1: " + t1.mostrarDimension());
		System.out.println("Su �rea es: " + t1.mostrarArea());
		System.out.println(t1.getEstilo());
		System.out.println("Informaci�n para T2: " + t2.mostrarDimension());
		System.out.println("Su �rea es: " + t2.mostrarArea());
		System.out.println(t2.getEstilo());
		System.out.println("Informaci�n para T2: ");
		System.out.println("****************HERENCIA UNICA****************************");

		// 17 herencia_unica.Gato
		// 18 herencia_unica.Siames
		// 19 MainHerencias
		Gato gato = new Gato(4, 2);
		System.out.println(gato);

		Siames siames = new Siames(4, 2);
		System.out.println(siames);
		System.out.println("****************HERENCIA MULTINIVEL****************************");
		// 20 herencia_multinivel.Persona
		// 21 herencia_multinivel.Empleado
		// 22 herencia_multinivel.Jefe

		// 23 MainHerencias
		Jefe jefe = new Jefe("Marcos", 41, "marcos.eljefe@yahoo.com", 645789789, "jefe de sector");
		System.out.println(jefe);
		System.out.println("***************************************************************");
		Jefe cajero = new Jefe("Marcos", 41, "marcos.eljefe@yahoo.com", 645789789, "cajero");

		System.out.println(cajero);

		System.out.println("****************HERENCIA JERARQUICA****************************");
		// 24 herencia_jerarquica.Gato
		// 25 herencia_jerarquica.Siames
		// 26 herencia_jerarquica.GatoComun
		// 27 herencia_jerarquica.Burmes
		// 28 MainHerencias

		Burmes burmes = new Burmes(4, 2);
		GatoComun gatocomun = new GatoComun(4, 2);

		ArrayList<Object> animales = new ArrayList<Object>(Arrays.asList(burmes, siames, gatocomun));
		for (Object animal : animales) {
			System.out.println(animal);
			System.out.println("***************************************************************");
		}

		System.out.println("****************HERENCIA M�LTIPLE****************************");
		/*
		 * Herencia M�ltiple (a trav�s de interfaces): en Herencia m�ltiple, una clase
		 * puede tener m�s de una superclase y heredar caracter�sticas de todas las
		 * clases principales. Tenga en cuenta que Java no admite herencia m�ltiple con
		 * clases. En Java, podemos lograr herencia m�ltiple solo a trav�s de
		 * Interfaces. 
		 */
		System.out.println("****************HERENCIA H�BRIDA****************************");
		/*
		 * Herencia H�brida (a trav�s de Interfaces): Es una mezcla de dos o m�s de los
		 * tipos de herencia anteriores. Como Java no admite herencia m�ltiple con
		 * clases, la herencia h�brida tampoco es posible con clases. En Java, podemos
		 * lograr herencia h�brida solo a trav�s de Interfaces.
		 */
		// Fuente: https://javadesdecero.es/poo/herencia-java-tipos-ejemplos/
	}
}