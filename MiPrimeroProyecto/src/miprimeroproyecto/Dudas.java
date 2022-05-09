package miprimeroproyecto;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Dudas {
	/*
	 * Me habe�s de alguna forma hecho parte de dudas sobre el comportamiento de
	 * JAVA en algunas ocasiones. Intentar� aqu� contestar a ellas con ejemplos.
	 */

	/**
	 * Podemos formatear una salida de datos haciendo uso de 
	 * la clase DecimalFormat
	 * formateador = new DecimalFormat("###,###.##");
	 */
	public static void comasOPuntos() {

		// Saco por teclado una variable de tipo double y la imprimo en pantalla.
//		String peticion = "Ingresar el primer n�mero";
//		String teclado = JOptionPane.showInputDialog(peticion);
//		double miNumero = Double.parseDouble(teclado);
		double miNumero = 1500.50;
		System.out.printf("Sin dar formato al n�mero, da: %.2f %n", miNumero);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		// Pero "###.###,##" saca una excepcion IllegalArgumentException
		// Y cuidado porque el m�todo format() de DecimalFormat devuelve un String
		// y no es del todo correcto si pones por ejemplo 1500.50, escribe 1.500,5
		System.out.printf("Una vez formateado, da: %s %n", 
				formateador.format(miNumero));
		// Tambi�n disponemos de la posibilidad de dar un formato adaptado por espacio
		// de pa�s.

		System.out.printf(Locale.US, "%.2f %n", miNumero);
		System.out.printf(Locale.FRANCE, "%.2f %n", miNumero);
		// Para Espa�a, no hay constantes
		// Tenemos que instanciar la clase Locale
		Locale spanish = new Locale("es", "ES");
		// Y indicarlo en el printf
		System.out.printf(spanish, "%.2f %n", miNumero);
		// DOC:
		// https://www.oracle.com/java/technologies/javase/jdk8-jre8-suported-locales.html

	}

	/**
	 * Se puede instanciar un double con la referencia D como lo hacemos con L
	 * Literales de decimales	 * 
	 * Ya sabemos que los 2 tipos de datos de decimales que 
	 * podemos manejar son float y double.
	 * Para estos casos la representaci�n del literal de decimales ser�n con
	 * separaci�n de un punto entre la parte entera y la parte decimal.
	 * 
	 * float variableFloat = 12.2F; double variableDouble = 12.2;
	 * 
	 * De igual manera que utilizamos las letras F o f para el tipo de dato float
	 * podemos hacerlo tambi�n con el tipo de dato double. 
	 * Siempre, por legilibilidad se recomienda
	 * la letra en may�sculas.
	 * 
	 * float variableFloat = 12.2F; double variableDouble = 12.2D;
	 * 
	 * 
	 */
	public static void dobleLiteral() {
		//float variableFloat = 12.2;
		int a = 2, b = 10, c = 19;
		double d = (double) (c - b) / a; // =4.5
		double ejemplo1 = 12.5478;
		double ejemplo2 = 12.5478d;

//		String x = (a == 0) 
//				? "Error: has introducido un valor igual a 0"
//				: "El valor de x en la ecuaci�n ax+b = c es " + 
//				Double.toString(Math.round(d * 100d) / 100d);
		String x = (a == 0) ? "Error: has introducido un valor igual a 0"
				: "El valor de x en la ecuaci�n ax+b = c es " + Double.toString(Math.round(d * 100) / 100);

		System.out.println(ejemplo1);
		System.out.println(ejemplo2);
		System.out.println(x);
	}

	/**
	 * Con Java se puede sobrecargar los m�todos. Esto significa 
	 * que puedes tener un
	 * m�todo public void miMetodo(float f) y public void miMetodo(double d) Los dos
	 * llevan el mismo nombre El m�todo escogido a la hora de lanzar la aplicaci�n
	 * solo depende del tipo de dato utilizado en parametro. Si le pasas una
	 * variable que ya est� conocida como float o double, no hay problema. Pero si
	 * le pasas un literal miMetodo( 5 ), entonces debes de poder especificar el
	 * tipo de dato que tiene el n�mero. Entonces puedes usar el d para doble y as�
	 * escojer el m�todo adecuado
	 */
	public static String miMetodo(float f) {
		return "Este m�todo usa un float";
	}

	public static String miMetodo(double d) {
		return "Este m�todo usa un double";
	}
	
	public static void switchEspecial() {
        int noOfMonth = 5;  
        switch(noOfMonth) //Switch expression  
        {  
          //Case statements  
          case 1: 
          case 3:
          case 5:
          case 7:
          case 9:
          case 11:
                          System.out.println("Este mes tienes 31 d�as");  
                  break;  
          case 2:
                          System.out.println("Este solo tiene 28 d�as");  
                  break;  
          case 4:
          case 6:
          case 8:
          case 10:
          case 12: 
                  System.out.println("Este tiene 30 d�as");  
                  break;  
          //Default case statement  
          default: System.out.println("Entrada invalida");  
         }  
	}

}
