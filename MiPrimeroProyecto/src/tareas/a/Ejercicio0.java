/*
 * Tienes que :
 * declarar una variable cad1 con tipo de dato String y atribuirle el valor "EJEMPLO CADENA". 
 * declarar una variable cad2  con tipo de dato String y atribuirle el valor "ejemplo cadena" en minúsculas. 
 * imprimir en pantalla los dos variables usando el método println(); 
 * usando el método printf(): 
    * imprimir en pantalla los dos variables; 
    * sacar en pantalla la longitud de cad1. 
    * concatenar cad1 con cad2.
    * comparar los cadenas usando cada uno de los 2 métodos disponibles.
    * comparar los cadenas usando cada uno de los 2 métodos disponibles.
    * sacar en pantalla los 5 primeros caracteres de cad1
    * Pasar cad1 a minúsculas
 * Obligar el sistema a pasar a la línea después del último ejercicio
 *
 */
package tareas.a;

/**
 *
 * @author Ludovic Laisnez
 */
public class Ejercicio0 {

    public static void main(String[] args) {
        String cad1 = "EJEMPLO CADENA";
        String cad2 = "ejemplo cadena";
        System.out.println("La cadena cad1 es: " + cad1 + " y cad2 es: " + cad2);
        System.out.printf("La cadena cad1 es: %s y cad2 es: %s", cad1, cad2);
        System.out.printf("\nLongitud de cad1: %d", cad1.length());
        // concatenación de cadenas (concat o bien operador +)
        System.out.printf("\nConcatenación: %s", cad1.concat(cad2));
        //comparación de cadenas
        System.out.printf("\ncad1.equals(cad2) es %b", cad1.equals(cad2));
        System.out.printf("\ncad1.equalsIgnoreCase(cad2) es %b", cad1.equalsIgnoreCase(cad2));
        System.out.printf("\ncad1.compareTo(cad2) es %d", cad1.compareTo(cad2));
        /*
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";
        
        System.out.println(s1.compareTo(s2));//0 because both are equal  
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 
        
        if s1 > s2, it returns positive number  
        if s1 < s2, it returns negative number  
        if s1 == s2, it returns 0  
         */

        //obtención de subcadenas
        System.out.printf("\ncad1.substring(0,5) es %s", cad1.substring(0, 5));

        //pasar a minúsculas
        System.out.printf("\ncad1.toLowerCase() es %s", cad2.toLowerCase());
        //Pasar a la linea
        System.out.println();

    }
}
