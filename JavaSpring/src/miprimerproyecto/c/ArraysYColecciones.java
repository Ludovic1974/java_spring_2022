package miprimerproyecto.c;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

import javax.swing.JOptionPane;

import miprimerproyecto.b.JOptionPaneEjemplos;

public class ArraysYColecciones {

	public ArraysYColecciones() {
		byte[] mi_cajon1 = new byte[10];
		// Array de tipo byte => byte[]
		// nombre => mi_cajon1
		// declaraci�n con 10 posiciones => new byte[10]
		mi_cajon1[0] = 15;
		// Ojo con la posici�n 0
		mi_cajon1[1] = 25;
		mi_cajon1[2] = 6;
		mi_cajon1[3] = 32;
		mi_cajon1[4] = -15;
		mi_cajon1[5] = 90;
//		 mi_cajon1[6] = 200;

// Imprimir 1 posicion
//		System.out.println("En mi primer cajon tengo " + mi_cajon1[0] + " canicas");
////		// Bucle para imprimir todas las posiciones
		for (int i = 0; i < mi_cajon1.length; i++) {
			if (mi_cajon1[i] > 0)
				System.out.println("En el cajon n�" + (i + 1) + " tengo " + mi_cajon1[i] + " canicas");
			else if (mi_cajon1[i] == 0)
				System.out.println("En el cajon n�" + (i + 1) + " no hay canicas");
			else
				System.out.println("En el cajon n�" + (i + 1) + " he perdido " + mi_cajon1[i] + " canicas");
		}
////
//		String[] paises = { "Espa�a", "Francia", "Portugal", "Alemania", "Belgica", "Italia", "Luxemburgo",
//				"Paises Bajos", "Dinamarca", "Irlanda", "Reino Unido", "Grecia" };
////
////		System.out.println("Repasando los paises con un bucle FOR");
//		for (int i = 0; i < paises.length; i++) {
//			System.out.println(paises[i]);
//		}
////
////		System.out.println("Repasando los paises con un bucle FOREACH");
//		for (String pais : paises) {
//			System.out.println(pais);
//		}
//		
//		for (byte cajon : mi_cajon1) {
//			System.out.println(cajon);
//		}
//
//		for (String pais : paises) {
//			System.out.println(pais);
//		}

//		String valores[] = new String[3];
//		for(int i = 0; i< valores.length; i++) //{
//		valores[i] = JOptionPane.showInputDialog("�Qu� valores deseas insertar en la matriz en la posici�n " + (i+1) + "?");
////		JOptionPane.showMessageDialog(null, valores[i], "Valor n�"+ (i+1), JOptionPane.INFORMATION_MESSAGE);
//		//}
//		for(int i = 0; i< valores.length; i++)
//		JOptionPane.showMessageDialog(null, valores[i], "Valor n�"+ (i+1), JOptionPane.INFORMATION_MESSAGE);
//		
		// Array de objetos
		Coche renault = new Coche("azul", "Renault");
		Coche seat = new Coche("rojo", "Le�n");
		Coche tauro = new Coche("negro", "Tauro");
	
		Coche coches[] = { renault, seat, tauro };
//		System.out.println("Repasando objetos con un bucle FOR");
//		for (int i = 0; i < coches.length; i++) {
//			System.out.println(coches[i]);
//		}
//		System.out.println("Repasando objetos con un bucle FOREACH");
//		for (Coche coche : coches) {
//			System.out.println(coche);
//		}

		// Array multidimensionales
		int[][] matrix = new int[2][3]; // un array 2D o matrix
		int[][][] array3D = new int[2][2][2]; // una array 3D
//
//		// declarar e inicializar array 2D
		int matrix2[][] = { { 2, 7, 9 }, { 3, 6, 1 } };
//
//		// imprimir array 2D con FOR
//		for (int i = 0; i < matrix2.length; i++) {
//			for (int j = 0; j < matrix2[i].length; j++) {
//				System.out.print(matrix2[i][j] + " ");
//			}
//			System.out.println();
//		}
		// imprimir array 2D con FOREACH
//		for (int[] m : matrix2) {
//			for (int x : m) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}
//		
//		String[][] datosPaises = new String[3][4];

//        datosPaises[0][0] = "Espa�a";
//        datosPaises[0][1] = "Mali";
//        datosPaises[0][2] = "Estados Unidos";
//        datosPaises[0][3] = "China";
//
//        datosPaises[1][0] = "Europa";
//        datosPaises[1][1] = "�frica";
//        datosPaises[1][2] = "Am�rica";
//        datosPaises[1][3] = "Asia";
//
//        datosPaises[2][0] = "castellano";
//        datosPaises[2][1] = "franc�s";
//        datosPaises[2][2] = "ingl�s";
//        datosPaises[2][3] = "mandarin";

        String[][] datosPaises = {
            {"Espa�a", "Europa", "castellano"},
            {"Mali", "�frica", "franc�s"},
            {"Estados Unidos", "Am�rica", "ingl�s"},
            {"China", "Asia", "mandarin"}
        };

//        for (String[] pais : datosPaises) {
//            for (String datos : pais) {
//                System.out.print(datos + " ");
//            }
//            System.out.println();
//        }

        //System.out.println("Idioma: " + paises[2][2]);
//        for (int i = 0; i < datosPaises.length; i++) {
//            System.out.println();
//           
//            for (int j = 0; j < datosPaises[i].length; j++) {
//                 if(j==0){
//                System.out.print("Nombre:");
//                } else if (j==1){
//                    System.out.print("Continente: ");
//                } else {
//                    System.out.print("Idioma oficial: ");
//                }
//                System.out.println(datosPaises[i][j]);
//            }
//        }
		

		// Otra forma de declarar
		int mi_cajon2[] = { 15, 25, 6, 32, -15, 90 };
		int arrayCloneado[] = mi_cajon2.clone();
//
//		// imprimir� false a medida que se crea una copia profunda
//		// para un array unidimensional
		System.out.println(mi_cajon2 == arrayCloneado);
		System.out.println(mi_cajon2.equals(arrayCloneado));
		for (int i = 0; i < arrayCloneado.length; i++) {
			System.out.print(arrayCloneado[i] + " ");

		}
		System.out.println();
//		System.out.println(coches.getClass());
//		System.out.println(arrayCloneado.getClass());
//		System.out.println(datosPaises.getClass());

		// COLECCIONES

		/*
		 * Una colecci�n representa un grupo de objetos. Esto objetos son conocidos como
		 * elementos. Cuando queremos trabajar con un conjunto de elementos, necesitamos
		 * un almac�n donde poder guardarlos. En Java, se emplea la interfaz gen�rica
		 * Collection para este prop�sito. Gracias a esta interfaz, podemos almacenar
		 * cualquier tipo de objeto y podemos usar una serie de m�todos comunes, como
		 * pueden ser: a�adir, eliminar, obtener el tama�o de la colecci�n� Partiendo de
		 * la interfaz gen�rica Collection extienden otra serie de interfaces gen�ricas.
		 * Estas subinterfaces aportan distintas funcionalidades sobre la interfaz
		 * anterior.
		 */

		/*
		 * Ventaja? Extensible, dotado de muchos m�todos, se usa porqu� no sabemos
		 * cuantos elementos va a tener en su interior.
		 * 
		 * Desventaja? Consume muchos recursos ya que est� previsto para 10 elementos
		 * iniciales y que si le a�adimos m�s, tiene que hacer un proceso interno para
		 * copiar el arraylist en otro y borrar el original.
		 * 
		 */

		/*
		 * Las colecciones en java heredan de una interfaz llamada Collection. Esta
		 * interfaz contiene interfaces o colecciones que heredan o descienden de ella.
		 * Estas interfaces son:
		 * 
		 * SET.
		 * 
		 * Almacena objetos no repetidos y sin ordenar. Las clases que heredan de esta
		 * interfaz son las siguientes.
		 * 
		 * IMAGEN SET
		 */
//		Set<String> frutas = new HashSet<String>();
//		frutas.add("manzana");
//		frutas.add("pera");
//		frutas.add("fresa");
//		frutas.add("naranja");
//		frutas.add("naranja");
//
//		frutas.remove("pera");
//
//		System.out.println("Hay solo " + frutas.size() + " frutas en el frigo");
//
//		// Comprueba se existe del elemento ('pera') que se le pasa como parametro
//		System.out.println(frutas.contains("fresa"));
//
//		// Almacena objetos no repetidos y sin ordenar.
//		for (String fruta : frutas) {
//
//			System.out.println(fruta);
//		}
//		System.out.println();
//		for (Object fruta : frutas) {
//			System.out.println(fruta);
//		}
//		System.out.println();

		/*
		 * QUEUE Tambi�n denominadas colas. En este caso, no se puede acceder a un
		 * elemento de manera aleatoria. Es decir, solo podemos acceder a un objeto que
		 * se encuentre o bien al principio, bien al final o a ambos dos.		 * 
		 * 
		 * IMAGEN QUEUE		 * 
		 */
		
//		Queue<String> cola = new ArrayDeque<String>();
//		cola.add("Elemento 1");
//		cola.add("Elemento 2");
//		cola.add("Elemento 3");
//		cola.add("Elemento 4");
//		cola.add("Elemento 5");
//		cola.add("Elemento 6");
//		cola.add("Elemento 7");
//		cola.add("Elemento 8");
//		cola.add("Elemento 9");
//		cola.add("Elemento 10");
//
//		cola.remove("Elemento 7");
////		//Borra el primer elemento
//		cola.remove();
//		cola.remove();
//		System.out.println("1er elemento de la cola: "+cola.element());
//		System.out.println("1er elemento de la cola: "+cola.poll());
//		System.out.println("1er elemento de la cola: "+cola.peek());
//		System.out.println("Tama�o de la cola: " + cola.size());
//		System.out.println("M�todo booleano: contains ->" + cola.contains("Elemento 4"));;
//		

		/*
		 * LIST.
		 * 
		 * Puede almacenar objetos repetidos, aunque tambi�n admite objetos no
		 * repetidos. En este caso, cada uno de los objetos o elementos se encuentran
		 * indexados a trav�s de un valor num�rico. Normalmente sustituye a los vectores
		 * o arreglos. Este tipo de colecci�n, permite acceder de forma aleatoria a un
		 * elemento.
		 * 
		 * Veamos las clases que heredan de esta interfaz. IMAGEN LIST
		 */

//		// ArrayList
		ArrayList<String> nombres = new ArrayList<String>();
//
		nombres.add("Aitor");
		nombres.add("Ana");
		nombres.add("Garbi�e");
		nombres.add("Jos�");
//		 nombres.add("Jos� Mar�a");
		nombres.add("Jos�");
//		 nombres.add("Jos� Benito");
		nombres.add(5, "Alex");
		nombres.add(6, "Marcus");
		nombres.add(7, "V�ctor");

		System.out.println("�Hay solo " + nombres.size() + " alumnos en la clase ? ");
		System.out.println("Me pregunto si el mejor alumno es " + nombres.get(0));
//		// Comprueba se existe del elemento ('Garbi�e') que se le pasa como parametro
		System.out.println(nombres.contains("Garbi�e"));
//		// Devuelve la posici�n de la primera ocurrencia ('Jos� Mar�a') en el ArrayList
		System.out.println(nombres.indexOf("Jos� Mar�a"));
//		// Devuelve la posici�n de la �ltima ocurrencia ('Ana') en el ArrayList
		System.out.println(
				"El nombre de " + nombres.get(nombres.lastIndexOf("Ana")) + " se encuentra en la posici�n " + nombres.lastIndexOf("Ana"));

		// Almacena objetos que pueden repetirse.

//		for (ArrayList<e> arr : nombres) {
//			System.out.println(arr);
//		}

//		// Borra el elemento de la posici�n '5' del ArrayList
		nombres.remove(6);
		System.out.println("Ahora en la pocici�n 6 est� " + nombres.get(6));
//
//		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
		System.out.println(nombres.remove("V�ctor"));
//
//		// Copiar un ArrayList
		ArrayList arrayListCopia = (ArrayList) nombres.clone();
//		// Pasa el ArrayList a un Array
//
		Object[] array = nombres.toArray();
		for (Object arr : array) {
			System.out.println(arr);
		}

		/*
		 * Otra cosa muy importante a la hora de trabajar con los ArrayList son los
		 * "Iteradores" (Iterator). Los Iteradores sirven para recorrer los ArrayList y
		 * poder trabajar con ellos. Los Iteradores solo tienen tres m�todos que son
		 * hasNext() para comprobar que siguen quedando elementos en el iterador, next()
		 * para que nos de el siguiente elemento del iterador; y remove() que sirve para
		 * eliminar el elemento del Iterador.
		 */

		Iterator<String> nombreIterator = nombres.iterator();
		while (nombreIterator.hasNext()) {
			System.out.print(nombreIterator.next() + " / ");
		}
		System.out.println();
//
//		// Borra todos los elementos de ArrayList
		nombres.clear();
//		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False
		if (nombres.isEmpty()) {
			System.out.println("No quedan nombres en la lista");
		}

	}

}
