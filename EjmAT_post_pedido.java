package ejmat_post_pedido;
/* @author Irma */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EjmAT_post_pedido {
    public static void main(String[] args) {
      //EJERCICIO DE ASIGNACI�N DE PEDIDOS
      Scanner leer = new Scanner(System.in);
      //crearemos lista de los almacenes mas cercanos
      List<Almacen> almacenes = new ArrayList<>();
      almacenes.add(new Almacen("Almacen Huallayco", "Jr. Huallayco", 8));
      almacenes.add(new Almacen("Almacen Portales", "Jr. Los cedros", 15));
      almacenes.add(new Almacen("Almacen Hu�nuco", "Jr. hu�nuco", 10));
      //ingresar ubicaci�n del cliente
        System.out.println("INGRESE SU UBICACI�N: ");
        String ubicaci�nC = leer.nextLine();
      //algor
      //Algortimo para encontrar almacen m�s cercano 
      Almacen MasCercano = encontrar(ubicaci�nC,almacenes);
      public static Almacen encontrar (String ubicaci�nC, List<Almacen> almacenes){
          return almacenes.get(0);
      }
      //CREANDO CLASE ALMACEN
      class Almacen {
          private String nombre;
          private String direcci�n;
          //la distancia es real
          private int distancia;
          public Almacen(String nombre, String direccion,int distancia){
              this.nombre = nombre;
              this.direcci�n = direcci�n;
              this.distancia = distancia;
          }
          public String getNombre(){
              return nombre;
          }
      }
    }
