package algoritmo3;
/* @author Irma */
import java.util.Scanner;
public class Algoritmo3 {
    public static void main(String[] args) {
        //algoritmo de verificar si el n�mero es positivo o negativo
        double num;
        Scanner entrada = new Scanner(System.in);
        //ingresar n�mero
        System.out.println("INGRESAR UN N�MERO: ");
        num = entrada.nextDouble();
        
        //verificando
        if (num > 0){
            System.out.println("EL N�MERO " +num+ " ES UN N�MERO POSITIVO");
        }else if (num < 0 ){
            System.out.println("EL N�MERO " +num+ " ES UN N�MERO NEGATIVO");
        } else {
            System.out.println("EL N�MERO ES CERO");
        }
        
    }  
}
