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
            puntaje = entrada.nextDouble();
            String leer = entrada.next();
            try {
                puntaje = Double.parseDouble(leer);
                if(puntaje >= 0 && puntaje <= 20 ){
                    break;
                }else {
                    System.out.println("Puntaje fuera de rango");
                    System.out.println("SOLO INGRESAR PUNTAJE DE (0-20)");
                }
            }catch (NumberFormatException e) {
                System.out.println("Puntuaci�n no v�lida");
                System.out.println("VUELVA A INGRESAR PUNTAJE");
                entrada.nextLine(); //para limpiar entrada
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
