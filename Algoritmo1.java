package algoritmo1;
/* @author Irma */
import java.util.Scanner;
public class Algoritmo1 {
    public static void main(String[] args) {
       /*EJEMPLO DE ALGORITMO 01*/
       int n�mero; 
       Scanner entrada = new Scanner(System.in);
       
       //solicitar al usuario ingresar un n�mero entero
       while(true){
        System.out.println("=== CALCULAR FACTORIAL ===");
       
        System.out.println("INGRESE UN N�MERO ENTERO: ");
            if(entrada.hasNextInt()){
                 n�mero = entrada.nextInt();
            //verificando si es negativo

            if (n�mero < 0){
                System.out.println("No se puede calcular n�meros negativos");
            }else {
                break; //Salir del bucle si el n�mero es entero positivo
            }
            }else{
                System.out.println("INGRESAR SOLO N�MEROS");
                entrada.nextLine();
            }
            } 
                //calculando la factorial
                long factorial = 1;
                for (int i = 1; i <= n�mero; i++ ) {
                    factorial *=i;
                }
                //salida, de mostrar resultado
                System.out.println("La factorial de "+n�mero+ "es = "+factorial);
            }
         }
    

