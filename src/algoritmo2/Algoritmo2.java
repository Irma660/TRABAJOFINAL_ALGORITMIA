package algoritmo2;
/* @author Irma*/
import java.util.Scanner;
public class Algoritmo2 {
    public static void main(String[] args) {
        double puntaje;
        Scanner entrada = new Scanner(System.in);
        //ingresar puntaje
        System.out.println("======= EVALUACI�N DE EXAMEN ======");
        System.out.println("INGRESAR PUNTACI�N DEL ESTUDIANTE: ");
        puntaje = entrada.nextDouble();
        
        //evaluaci�n
        if (puntaje >= 11.5 ){
            System.out.println("El estudiante ha aprobado");
        }else {
            System.out.println("El estudiante ha desaprobado");
        }
        
    }  
}
