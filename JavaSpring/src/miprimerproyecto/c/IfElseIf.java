package miprimerproyecto.c;

import java.util.Scanner;

/**
 * Se solicita leer un n�mero entero positivo y determinar si es un n�mero de 1, 2,3 o 4 cifras.
 * @author Ludovic Laisnez
 */
public class IfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un n�mero de 1 a 100000");
        num = teclado.nextInt();
        if(num > 0 && num < 10){
            System.out.println("el n�mero es de 1 cifra");
        } else if(num >=10  && num < 100) {
            System.out.println("el n�mero es de 2 cifras");
        } else if(num >= 100 && num < 1000) {
            System.out.println("el n�mero es de 3 cifras");
        } else if(num >= 1000 && num < 10000) {
            System.out.println("el n�mero es de 4 cifras");
        } else if(num >= 10000 && num < 100000){
            System.out.println("el n�mero es de 5 cifras");
        } else {
            System.out.println("Este n�mero no est� permitido");
        }
        teclado.close();
        
        
    }

}
