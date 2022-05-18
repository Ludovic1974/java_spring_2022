package miprimerproyecto.f.abstraccion;

import java.util.ArrayList;
import java.util.Arrays;

import miprimerproyecto.f.herencia.herencia_jerarquica.Burmes;
import miprimerproyecto.f.herencia.herencia_jerarquica.Gato;
import miprimerproyecto.f.herencia.herencia_jerarquica.GatoComun;

public class Main {

	// 1-3 HERO
	// 4-5 BARBARO
	// 6 ARQUERO
	// 7 MAGO
	// 8-11 MAIN
	// 12 ARQUERO
	// 13-14 MAIN

	public static void main(String[] args) {

//		Persona persona[] = new Persona[2];
//		persona[0] = new Empleado("José", 10000, "Informática");
//		persona[1] = new Alumno("Rafa");
//		persona[0] = (Empleado) persona[0];
//
//		for (Persona p : persona) {
//			System.out.println(p);
//		}

		Empleado empleado1 = new Empleado("José", 10000, "Informática");
		Empleado empleado2 = new Empleado("David", 11000, "Informática");
		Empleado empleado3 = new Empleado("Gorka", 12000, "Informática");
		ArrayList<Empleado> heroes = new ArrayList<Empleado>(Arrays.asList(empleado1, empleado2, empleado3));
		
		
		for (Empleado e : heroes) {
			
			if(e.getSueldo()>10000) {
				System.out.println(e);
			}
		}

		/*
		 * 8 Las clases declaradas como abstractas no pueden ser instanciadas
		 */
		// Hero heroe = new Hero("Martin el magnifico");

		// 9
		// normalmente tendriamos tendencia a crear una instancia de
		// cada clase derivada de Hero
//		Barbaro conan = new Barbaro("Conan el bárbaro");
//		Arquero legolas = new Arquero("Legolas el elfo");
//		Mago balthasar = new Mago("Balthasar el blanco");
////
//		ArrayList<Object> heroes = new ArrayList<Object>(Arrays.asList(conan, legolas, balthasar));
//		for (Object hero : heroes) {
//			System.out.println(hero);
//			System.out.println("***************************************************************");
//		}

		// 10
		// Pero JAVA soporta el polimorfismo y podemos crear
		// las instancias usando la clase abstracta.
		// CON UNA CLASE DOTADA DE HERENCIA
		// (SIN INTERFAZ O SIN ABTRACCIÓN)
		// NO PODEMOS HACER LO SIGUIENTE:
//		Gato burmes = new Burmes(4, 2);
//		Gato gatocomun = new GatoComun(4, 2);
//		Burmes burmes = new Gato(4, 2);
//		GatoComun gatocomun = new Gato(4, 2);
//		Burmes burmes = new Burmes(4, 2);
//		GatoComun gatocomun = new GatoComun(4, 2);

		// 11 PERO CON CLASES ABSTRACTAS Y CON INTERFACES SÍ
//		Hero conan = new Barbaro("Conan el bárbaro");
//		Hero legolas = new Arquero("Legolas el elfo");
//		Hero balthasar = new Mago("Balthasar el blanco");

//		ArrayList<Hero> heroes = new ArrayList<Hero>(Arrays.asList(conan, legolas, balthasar));
//		for (Hero hero : heroes) {
//			System.out.println(hero);
//			System.out.println("***************************************************************");
		// 13 OJO con las propiedades y los métodos que implementan cada heroe.
		// Si creas un método en una clase que no sea heredada, no tendrás acceso a
		// ellos desde la clase abstracta.
		// En la clase arquero, he creado un método al que puedo tener acceso solo
		// si instancio un arquero.
//			 hero.getEspecialidad();

	}

	// 14
//	Arquero bardo = new Arquero("Bardo el matador de dragones");
//	System.out.println(bardo);
//		System.out.println(bardo.getEspecialidad());

//		Abuelo fernando = new Abuelo(); 
//		fernando.setNombre("Fernando");
//	System.out.println(fernando.getNombre());
//	BisAbuelo erick = new Abuelo(); 
//		

	// }

}
