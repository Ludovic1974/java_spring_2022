package miprimerproyecto.c;

public class WhilePrimo {

	public static void main(String[] args) {	
		int x = 1;
		while (x < 1000) {
			if (esPrimo(x)) {
				System.out.println(x);
			} 
			x++; 
		}
		System.exit(0);
	}

	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos n�meros, no
			// es primo
			if (numero % x == 0) {
				return false;
			}
		}
		// Si no se pudo dividir por ninguno de los de arriba, s� es primo
		return true;
	}
}
