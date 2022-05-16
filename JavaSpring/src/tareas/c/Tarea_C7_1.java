package tareas.c;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tarea_C7_1 {

	/**
	 * En un casino de juegos se desea mostrar los mensajes respectivos por el
	 * puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a
	 * los siguientes resultados: Si los tres dados son seis, mostrar el mensaje
	 * Excelente Si dos dados se obtiene seis, mostrar el mensaje Muy bien Si un
	 * dado se obtienen seis, mostrar el mensaje Regular Si ningún dado se obtiene
	 * seis, mostrar el mensaje Pésimo
	 * 
	 * @author Ludovic Laisnez
	 */
	public Tarea_C7_1() {
		
		
		// TODO Auto-generated method stub
		//JOSÉ MARÍA
				Scanner sc = new Scanner(System.in);
				byte [] dados = {0,0,0};
				byte cuantos = 0;
				System.out.println("Cuanto vale el dado 1?:");
				dados[0] = sc.nextByte();
				System.out.println("Cuanto vale el dado 2?:");
				dados[1] = sc.nextByte();
				System.out.println("Cuanto vale el dado 3?:");
				dados[2] = sc.nextByte();
				for (int i = 0; i<3; i++) {
					if (dados[i] == 6) {
						cuantos++;
					}
				}
				for (int i = 0; i<3; i++) {
					if (dados[i] > 6 || dados[i]<= 0) {
						System.out.println("has metido un dado incorrecto");
						System.exit(-1);
					}
				}
				if (cuantos == 0) {
					System.out.println("El resultado es pesimo");
				}
				if (cuantos == 1) {
					System.out.println("El resultado es Regular");
				}
				if (cuantos == 2) {
					System.out.println("El resultado es Muy Bueno");
				}
				if (cuantos == 3) {
					System.out.println("El resultado es Excelente");
				}
				sc.close();
	
				
				
				//ALEX
//		String tirada1 = JOptionPane.showInputDialog("Tirada 1");
//        int dado1 = Integer.parseInt(tirada1);
//        
//        String tirada2 = JOptionPane.showInputDialog("Tirada 2");
//        int dado2 = Integer.parseInt(tirada2);
//        
//        String tirada3 = JOptionPane.showInputDialog("Tirada 3");
//        int dado3 = Integer.parseInt(tirada3);
//        
//        int cont=0;
//        
//        if (dado1==6) {
//            cont++;
//        } 
//        if (dado2==6) {
//            cont++;
//        } 
//        if (dado3==6) {
//            cont++;
//        } 
//        if (cont==1) {                    
//            System.out.println("Regular");
//        } else if (cont==2) {
//            System.out.println("Muy Bien");
//        }else if (cont==3) {
//            System.out.println("Excelente");
//        }else{
//            System.out.println("Pesimo");
//        }

		
		int dado = 0;

		Scanner teclado = new Scanner(System.in);
		try {
		System.out.println("¿Qué resultado has obtenido en el primer lanzamiento?");
		dado = (teclado.nextInt() == 6) ? ++dado : dado;
		System.out.println("¿Qué resultado has obtenido en el segundo lanzamiento?");
		dado = (teclado.nextInt() == 6) ? ++dado : dado;
		System.out.println("¿Qué resultado has obtenido en el último lanzamiento?");
		dado = (teclado.nextInt() == 6) ? ++dado : dado;
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

		if (dado == 3) {
			System.out.println("¡Excellente!");
		} else if (dado == 2) {
			System.out.println("¡Muy bien!");
		} else if (dado == 1) {
			System.out.println("¡Regular!");
		} else {
			System.out.println("¡Pésimo!");
		}
		teclado.close();
	}
	
	

}
