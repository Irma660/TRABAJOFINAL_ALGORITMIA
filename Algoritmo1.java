package algoritmo1;
/* @author Irma */
import java.util.Scanner;
public class Algoritmo1 {
    public static void main(String[] args) {
       /*EJEMPLO DE ALGORITMO 01*/
       int número; 
       Scanner entrada = new Scanner(System.in);
       
       //solicitar al usuario ingresar un número entero
       while(true){
        System.out.println("=== CALCULAR FACTORIAL ===");
       
        System.out.println("INGRESE UN NÚMERO ENTERO: ");
            if(entrada.hasNextInt()){
                 número = entrada.nextInt();
            //verificando si es negativo

            if (número < 0){
                System.out.println("No se puede calcular números negativos");
            }else {
                break; //Salir del bucle si el número es entero positivo
            }
            }else{
                System.out.println("INGRESAR SOLO NÚMEROS");
                entrada.nextLine();
            }
            } 
                //calculando la factorial
                long factorial = 1;
                for (int i = 1; i <= número; i++ ) {
                    factorial *=i;
                }
                //salida, de mostrar resultado
                System.out.println("La factorial de "+número+ "es = "+factorial);
            }
         }
    

