package algoritmo4;
/* @author Irma */
import javax.swing.JOptionPane;
public class Algoritmo4 {
    public static void main(String[] args) {
        //ejercicio contador de letras a con joptionPane
        
        String frase = JOptionPane.showInputDialog("INGRESAR FRASE");
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
            contador++;
            }
            }else {
                JOptionPane.showConfirmDialog(null, "ERROR. INGRESÓ CARACTERES NO VÁLIDOS");
            }
        }
        JOptionPane.showConfirmDialog(null, "La frase \"" + frase + "\" contiene " + contador + " letras 'a'.");
    }  
}
