package tareas.b;

import javax.swing.JOptionPane;

public class Tarea_B4_1 {

	public Tarea_B4_1() {

		String primerNumero = "", segundoNumero = "", tercerNumero = "";

		String resultado = "";

		int numero1 = 0, numero2 = 0, numero3 = 0;

		primerNumero = JOptionPane.showInputDialog("Ingresar el primer n�mero");
		segundoNumero = JOptionPane.showInputDialog("Ingresar el segundo n�mero");
		tercerNumero = JOptionPane.showInputDialog("Ingresar el tercer n�mero");

		try {
			numero1 = Integer.parseInt(primerNumero);
			numero2 = Integer.parseInt(segundoNumero);
			numero3 = Integer.parseInt(tercerNumero);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, 
					"Error, no has ingresado n�meros.", 
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
		resultado = "Ingresaste los n�meros: " + numero1 + ", " + numero2 + ", " + numero3;
		resultado = resultado + "La suma es " + (numero1 + numero2 + numero3);
		resultado += "La media es " + ((numero1 + numero2 + numero3)/3) + ".\n";
		resultado += "El producto es " + (numero1 * numero2 * numero3) + ".\n";
		
		JOptionPane.showMessageDialog(null, 
				resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);					

	}

}
