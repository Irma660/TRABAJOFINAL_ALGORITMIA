package algoritmo3;
/* @author Irma */
import java.util.Scanner;
public class Algoritmo3 {
    public static void main(String[] args) {
        //algoritmo de verificar si el número es positivo o negativo
        double num;
        Scanner entrada = new Scanner(System.in);
        //ingresar número
        System.out.println("INGRESAR UN NÚMERO: ");
        num = entrada.nextDouble();
        
        //verificando
        if (num > 0){
            System.out.println("EL NÚMERO " +num+ " ES UN NÚMERO POSITIVO");
        }else if (num < 0 ){
            System.out.println("EL NÚMERO " +num+ " ES UN NÚMERO NEGATIVO");
        } else {
            System.out.println("EL NÚMERO ES CERO");
        }
        
    }  
}
