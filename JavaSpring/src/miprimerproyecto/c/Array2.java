package miprimerproyecto.c;
import javax.swing.*;
/**
 *
 * @author Ludo
 */
public class Array2 {
	public static void main(String[] args) {
        //array meses
        String arrMeses[] = {"Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        //array dias mes
        int arrDias[] = {31, 28, 31, 30, 31, 30,
                         31, 31, 30, 31, 30, 31};

        while (true) {
            int iMes =
                Integer.parseInt(JOptionPane.showInputDialog("N�mero de mes"));
            if ((iMes < 1) || (iMes > 12)) {
                JOptionPane.showMessageDialog(null, "N�mero de mes erroneo");
                continue;
            }
            String strMsg = "En " + arrMeses[iMes - 1] +
                    ", hay " + arrDias[iMes - 1] + " d�as.";
            JOptionPane.showMessageDialog(null, strMsg);
            break;
        }

    }
}
