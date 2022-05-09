package miprimeroproyecto.c;

import java.util.Scanner;

public class Areas {	
	
	public Areas() {
	// Empiezo por declarar e instanciar los variables que voy a utilizar varias
			// veces a lo largo del programa
			int lado = 0, base = 0, altura = 0, radio = 0;

			Scanner entrada = new Scanner(System.in);
			System.out.println("Elige una forma "
					+ "\n1:Cuadrado \n2:Rect�ngulo \n3:Tri�ngulo \n4:C�rculo");
			int forma = entrada.nextInt();
			// Tambi�n podr� funcionar con el if/else
			// Pero aqu� trataremos de aprender el uso del Switch
			switch (forma) {
			case 1:
				// Convertimos a entero la entrada usuario y usamos Math para sacar la area del
				// cuadrado
				System.out.println("Introduzca el lado");
				lado = entrada.nextInt();
				System.out.println("El area del cuadrado es " + (Math.pow(lado, 2)));
				break;
			case 2:
				System.out.println("Introduzca la base");
				base = entrada.nextInt();
				System.out.println("Introduzca la altura");
				altura = entrada.nextInt();		
				System.out.println("El area del rect�ngulo es " + (base * altura));
				break;
			case 3:
				System.out.println("Introduzca la base");
				base = entrada.nextInt();
				System.out.println("Introduzca la altura");
				altura = entrada.nextInt();						
				System.out.println("El area del tri�ngulo es " + ((base * altura) / 2));
				break;
			case 4:
				System.out.println("Introduzca el radio");
				radio = entrada.nextInt();					
				System.out.printf("El area del c�rculo es %1.2f%n", Math.PI * Math.pow(radio, 2));
				break;
			default:
				System.out.println("El n�mero que has introducido no es v�lido\n");
			}
			System.out.println("Saliendo...");
			entrada.close();
			System.exit(0);
	}
}
