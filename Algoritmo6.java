package algoritmo6;
/*@author Irma*/
import java.util.Scanner;
public class Algoritmo6 {
    public static void main(String[] args) {
        // algoritmo 6, sistema de decisión de llevar paraguas
        String lluvia;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("====DECISIÓN DE LLEVAR PARAGUAS====");
        System.out.println("---------¿está lloviendo?----------");
        System.out.println("-------> SI/NO          -------    ");
        //aceptar minuscula o mayuscula
        lluvia = scanner.next().toLowerCase();
        //swicth
        switch (lluvia) {
           case "si":
           System.out.println("        ¿Tienes paraguas?          ");
           System.out.println("-------> SI/NO          -------    ");
           String paraguas = scanner.next().toLowerCase();
            switch (paraguas){
                case "si":
                    System.out.println("Lleva el paraguas contigo");
                    break;
                case "no":
                    System.out.println("No es necesario");
                    break;
                default:
                    System.out.println("RESPUESTA NO VÁLIDA");
                    break;
            }
        }
    }    
}
