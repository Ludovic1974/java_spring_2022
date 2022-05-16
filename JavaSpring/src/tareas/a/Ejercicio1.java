/*
 * Pedir al usuario que introduzca un número entero. 
 * El sistema calcula la raíz cuadrada de este número y saca en pantalla en una sola linea 
 * el resultado redondeándolo con cuatro dígitos y sin hacer uso de salto de línea. 
 */
package tareas.a;

import javax.swing.JOptionPane;

/**
 *
 * @author Ludovic Laisnez
 */
public class Ejercicio1 {
     public static void main(String[] args) {
         //En tipo text pedimos un número al usuario
         String num1 = JOptionPane.showInputDialog("Introduce un número");
         /*
         Convertimos al tipo de dato doble el número del usuario 
         Porqué? 
         Pues el método Math que vamos a usar después exije que el número 
         que pasamos en parametro sea de tipo Double. 
         */
         double num2 = Double.parseDouble(num1);
         //Uso el método print para no imprimir con salto de linea
         System.out.print("La raíz cuadrada de " + num1 + " es: ");
         //el metodo printf tiene dos parametros: El formato que imponemos al 
         //formato deseado de la salida %1.4 y el valor númerico 
         System.out.printf("%1.4f", Math.sqrt(num2));
         
     }
}
