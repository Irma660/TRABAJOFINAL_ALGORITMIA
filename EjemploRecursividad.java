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
    }
    
}
