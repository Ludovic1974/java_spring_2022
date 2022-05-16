package tareas.b;

import javax.swing.JOptionPane;

public class Tarea_B4_2 {
	static String nombre1 = "Humano"; 
	
	public Tarea_B4_2() {
		
		
		String nombre2 = "Ludovic"; 
		
		
		
		
		String primerNumero = "", segundoNumero = "", tercerNumero = "";
		int a = 0, b = 0, c = 0;
		
		primerNumero = JOptionPane.showInputDialog("Ingresar el primer número");
		segundoNumero = JOptionPane.showInputDialog("Ingresar el segundo número");
		tercerNumero = JOptionPane.showInputDialog("Ingresar el tercer número");
		
		try {
			a = Integer.parseInt(primerNumero);
			b = Integer.parseInt(segundoNumero);
			c = Integer.parseInt(tercerNumero);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, 
					"Error, no has ingresado números.", 
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		} 
		
		try {
			double d = (double)(c - b)/a; 
			
			String x; 
			
			x = (a == 0) ? "Error: has introducido un valor igual a 0" : 
				"El valor de x en la ecuación ax+b = c es " + 
					Double.toString(Math.round(d*100d)/100d);
		System.out.println(x);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, 
					"Error, a es igual a 0.", 
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		} 
		
		
	
		

	}

}
