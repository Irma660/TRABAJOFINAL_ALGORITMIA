package ejmatde_pre_pedido;
/*@author Irma*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class producto{
    String nombre;
    
    public producto(String nombre) {
        this.nombre = nombre;
    }
}
public class EjmATde_pre_pedido {
    public static List<producto> recomendacion(List<producto>productosComprados){
        List<producto> recomendaciones = new ArrayList<>();
        recomendaciones.add(new producto("café"));
        recomendaciones.add(new producto("azúcar"));
        return recomendaciones;
    }
    public static void main(String[] args){ 
        String productoIngresado;
        List<producto> productosComprados = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese sus productos comprados ");
        System.out.println("Ingrese 'SALIR' para finalizar");
        /*Crearemos un bucle con la siguiente condición: Después que el cliente ingrese
        sus productos comprados, pondrá la opción de SALIR o salir, y automáticamente
        le saldrá la lista de los productos recomendados, cerrando el sistema */
        while (true){
            productoIngresado = entrada.nextLine();
            if (productoIngresado.equalsIgnoreCase("salir")){
                break;
            }
            productosComprados.add(new producto(productoIngresado));
        }//fin de bucle
        //llamados al metodo recomendaciones para obtener los productos relacionados
        List<producto> recomendaciones = recomendacion(productosComprados);
        System.out.println("PRODUCTOS RECOMENDADOS: ");
        for (producto p : recomendaciones){
            System.out.println(p.nombre); 
        }
    }
    
}
