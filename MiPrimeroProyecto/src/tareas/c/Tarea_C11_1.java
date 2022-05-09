package tareas.c;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

/**
 *
 * @author Ludo
 */
public class Tarea_C11_1 {
	public static void main(String[] args) {
//		ArrayList<String> arboles = new ArrayList<>(Arrays.asList("Peral", "Ciruelo", "Manzano"));
//		ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Peras", "Ciruelas", "Manzanas"));
//		Object salida = JOptionPane.showInputDialog(null, "Selecciona un arbol", "Arbol", JOptionPane.QUESTION_MESSAGE,
//				null, arboles.toArray(), arboles.toArray()[0]);
//		String msg = "En un " + salida + ", hay unas " + frutas.get(arboles.lastIndexOf(salida)) + " muy ricas.";
//		JOptionPane.showMessageDialog(null, msg);

		ArrayList<String> meses = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		ArrayList<Integer> dias = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
		Object salida = JOptionPane.showInputDialog(null, "Selecciona un mes", "Mes", JOptionPane.QUESTION_MESSAGE,
				null, meses.toArray(), meses.toArray()[0]);	
		if (salida.toString() == "Febrero") {
			int anio = Integer.parseInt(JOptionPane.showInputDialog("Insertar el año:"));
			double cuatro, cien, cuatrocientos; 
			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
				String msg = "En " + salida + ", hay 29 días.";
				JOptionPane.showMessageDialog(null, msg);
			} else {
				String msg = "En " + salida + ", hay 28 días.";
				JOptionPane.showMessageDialog(null, msg);
			}
		} else {
			String msg = "En " + salida + ", hay " + dias.get(meses.lastIndexOf(salida)) + " días.";
			JOptionPane.showMessageDialog(null, msg);
		}

	}
}
