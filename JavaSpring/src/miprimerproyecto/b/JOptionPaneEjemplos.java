package miprimerproyecto.b;

import javax.swing.*;

//import java.awt.event.*;

/**
 * 
 * @author Ludovic Laisnez
 *
 */
public class JOptionPaneEjemplos {

	/**
	 * En aplicaciones basadas en Windows, Java Swing hace que sea muy f�cil de
	 * desarrollar y es una API muy potente. JOptionPane es solo una parte de ella.
	 * Simplifica la creaci�n de cuadros de di�logo. Proporciona cuadros de di�logo
	 * est�ndar, como el cuadro de di�logo de entrada, el cuadro de di�logo de
	 * confirmaci�n y el cuadro de di�logo de mensaje. Tambi�n podemos crear
	 * nuestros propios cuadros de di�logo personalizados. Dado que JOptionPane
	 * proporciona cuadros de di�logo est�ndar, es muy �til. *
	 */
	public JOptionPaneEjemplos() {
//		//EJEMPLO 1
//		//String pregunta = JOptionPane.showInputDialog("Aqu� va la pregunta");
//		 String nombre = JOptionPane.showInputDialog("Nombre: ");
//		String entradaNombre = "Nombre: ";
//		// Un nombre de usuario
//		 String nombre = JOptionPane.showInputDialog(entradaNombre);
//		 String entradaEdad = "Edad: ";
//		// La edad del usuario
//		 String edad = JOptionPane.showInputDialog(entradaEdad);
//		// Si declaramos todo como String, obtenemos un resultado sorprendente
////		 System.out.println("Hola "+ nombre +" . El a�o que viene tendr�s "+ (edad+1)
////		 +" a�os.");
//		// Necesitamos hacer una conversi�n
//		// Necesitar� importar un paquete est�tico
//		 int edadUser = Integer.parseInt(edad);
//		 
//		 //o
//		 //int edad = Integer.parseInt(JOptionPane.showInputDialog(entradaEdad));
//		 System.out.println("Hola " + nombre + " . El a�o que viene tendr�s " +
//		 (edadUser + 1) + " a�os.");

		// EJEMPLO 2
		// forma de uso 1
		// USOS DE showMessageDialog()
		// El m�todo acepta 2 par�metros. El primero es un objeto JFrame.
//		 JFrame f =new JFrame();
//		 JOptionPane.showMessageDialog(f,"Hola y bienvenido al Campus de C2B.");
		// forma de uso 2
		// otra forma de proceder
//		 JFrame f;
//		 f=new JFrame();
//		 JOptionPane.showMessageDialog(f,"Hola y bienvenido al Campus de C2B.");
		// forma de uso 3
		// Tambi�n puedo usar la menci�n null
//		 JOptionPane.showMessageDialog(null,"Hola y bienvenido al Campus de C2B.");
		// formas de uso 4 CON 4 PAR�METROS
		// JOptionPane.showMessageDialog(null, "Algo ha ido mal...", "Error en el
		// t�tulo", JOptionPane.ERROR_MESSAGE);
		// JOptionPane.showMessageDialog(null, "Algo ha ido mal...", "Error en el
		// t�tulo", 0);
		// INFORMATION_MESSAGE
//		JOptionPane.showMessageDialog(null, "Informaci�n acerca de NOSEKE.", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);	
		// JOptionPane.showMessageDialog(null, "Informaci�n acerca de NOSEKE.",
		// "Informaci�n", 1);
		// WARNING_MESSAGE
//		JOptionPane.showMessageDialog(null, "Operaci�n realizada con �xito.", "Alerta", 2);
		// JOptionPane.showMessageDialog(null, "Operaci�n realizada con �xito.",
		// "Alerta", JOptionPane.WARNING_MESSAGE);
		// QUESTION_MESSAGE
		// JOptionPane.showMessageDialog(null, "Tenemos una pregunta.", "Pregunta", 3);
//		JOptionPane.showMessageDialog(null, "Tenemos una pregunta.", "Informaci�n", JOptionPane.QUESTION_MESSAGE);	

		// EJEMPLO 3
		// showInputDialog()
//		String name = JOptionPane.showInputDialog( "Insertar su nombre:" );
//		JOptionPane.showMessageDialog(null, "Hola " + name);

		// EJEMPLO4
//		showConfirmDialog()
//		int input = JOptionPane.showConfirmDialog(null, "�Confirmar ejecuci�n");
//		// 0=yes, 1=no, 2=cancel
//		System.out.println(input);		

		// ejemplo5
		Object[] colores = { "rojo", "negro", "amarillo", "azul", "majenta" };
		// JOptionPane.showInputDialog(padre, mensaje, titulo, tipo de seleccion, tipo
		// de mensaje, icono, opciones, valor inicial);
		String salida = JOptionPane.showInputDialog(null, "Selecciona un color", 
				"Elegir", JOptionPane.QUESTION_MESSAGE,
				null, colores, colores[0]).toString();
		JOptionPane.showMessageDialog(null, salida);
		
	}

}
