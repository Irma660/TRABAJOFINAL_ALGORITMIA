package algoritmo1;
/* @author Irma */
import java.util.Scanner;
public class Algoritmo1 {
    public static void main(String[] args) {
       /*EJEMPLO DE ALGORITMO 01*/
       int número;
       Scanner entrada = new Scanner(System.in);
       
       //solicitar al usuario ingresar un número entero
        System.out.println("=== CALCULAR FACTORIAL ===");
        System.out.println("INGRESE UN NÚMERO ENTERO: ");
        número = entrada.nextInt();
       //verificando si es negativo
       if (número < 0){
           System.out.println("No se puede calcular números negativos");
       } else {
           //calculando la factorial
           long factorial = 1;
           for (int i = 1; i <= número; i++ ) {
               factorial *=i;
           }
       }
    }
    
}
