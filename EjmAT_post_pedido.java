package ejmat_post_pedido;
/* @author Irma */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EjmAT_post_pedido {
    public static void main(String[] args) {
      //EJERCICIO DE ASIGNACIÓN DE PEDIDOS
      Scanner leer = new Scanner(System.in);
      //CREANDO CLASE ALMACEN
      class Almacen {
          private String nombre;
          private String dirección;
          //la distancia es real
          private int distancia;
          public Almacen(String nombre, String direccion,int capacidad){
              this.nombre = nombre;
              this.dirección = dirección;
              this.distancia = distancia;
          }
          public String getNombre(){
              return nombre;
          }
      }
      
    }
    
}
