package algoritmo2;
/* @author Irma*/
import java.util.Scanner;
public class Algoritmo2 {
    public static void main(String[] args) {
        double puntaje;
        Scanner entrada = new Scanner(System.in);
        //ingresar puntaje
        do{
            System.out.println("======= EVALUACI�N DE EXAMEN ======");
            System.out.println("INGRESAR PUNTACI�N DEL ESTUDIANTE: ");
            if (entrada.hasNextDouble()){
                puntaje = entrada.nextDouble();
                break;
            }else {
                System.out.println("Puntuaci�n no v�lida");
                System.out.println("VUELVA A INGRESAR PUNTAJE");
            }
            } while(true);
            //evaluaci�n
            if (puntaje >= 11.5 ){
                System.out.println("El estudiante ha aprobado");
            }else {
                System.out.println("El estudiante ha desaprobado");
            }

        }  
    }
