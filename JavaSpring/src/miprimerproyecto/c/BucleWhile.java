package miprimerproyecto.c;


import javax.swing.JOptionPane;
/**
 *
 * @author Ludovic Laisnez
 */
public class BucleWhile {
      public static void main(String[] args) {
//          //Declaramos 3 variables
//          //La primera su nombre
          String clave = "Ludo";
//          //La segunda la dejamos vacia
          String pass = "";
//          //La pregunta que haremos al usuario
          String preguntaUsuario = "�Contrase�a?"; 
//          //El n�mero de veces que el usuario lo ha intentado
          int tantas = 0;
//          
//          //Iniciamos un bucle que se parar� solo si el usuario adivina  
//          //la clave
          while (clave.equals(pass) != true) {             
              pass = JOptionPane.showInputDialog(preguntaUsuario);
              tantas++;
              if(clave.equals(pass) != true){
              System.out.println("Contrase�a incorrecta. Int�ntalo otra vez.");
              }
          }
          System.out.print("Lo has logrado!!! Y adem�s lo has hecho ");
          if (tantas == 1){
              System.out.println("a la primera");
          } 
          else {
              System.out.println("en " + tantas + " veces.");
          }
          
          
      }
}
