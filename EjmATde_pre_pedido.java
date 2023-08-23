package ejmatde_pre_pedido;
/*@author Irma*/
import java.util.ArrayList;
import java.util.List;
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
    }
    
}
