package ejemplorecursividad;
/**@author Irma*/
public class EjemploRecursividad {
    public static int sumaN (int numero){
        if ( numero == 1){
            return 1;
        }else {
        return numero + sumaN(numero - 1);
        }
}
    public static void main(String[] args) { 
        int n = 10;
        int r = sumaN(n);
        System.out.println("La suma de los primeros " + n + " números naturales es = " +r);
    }
    
}
