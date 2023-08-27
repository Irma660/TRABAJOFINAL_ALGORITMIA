package algoritmo5;
/* @author Irma*/
import java.util.Scanner;
public class Algoritmo5 {
    public static void main(String[] args) {
        // algoritmo5, validación de licencias de conducir 
        int edad;
        Scanner leer = new Scanner(System.in);
        //pidiendo ingresar edad
        System.out.println("---VERIFICACIÓN DE LICENCIAS DE CONDUCIR---");
        System.out.println("->INGRESA TU EDAD: ");
        edad = leer.nextInt();
         //verificando 
         if (edad >= 18){
             System.out.println("¿TIENES LICENCIA DE CONDUCIR, VIGENTE?");
             System.out.println("---->(SI/NO)");
             //aceptar palabras en mayuscula o minuscula
             String tieneL = leer.next().toLowerCase();
             //condicional
             if (tieneL.equals("si")){
                 System.out.println("------¡PUEDES CONDUCIR!-----");
             }else {
                 System.out.println("----¡NO PUEDES CONDUCIR!----");
                 System.out.println("=====RENUEVA TU LICENCIA====");
             }
         }else {
                 System.out.println("----¡NO PUEDES CONDUCIR!----");
                 System.out.println("=====ERES MENOR DE EDAD=====");
         }
        
    }
}
