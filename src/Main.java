import com.adecco.modelo.producto;


public class Main {
    public static void main(String[] args)
    {
        producto p1 = new producto();
        p1.setNumProducto(1);
        p1.setNumProducto(1);
        System.out.println("id producto"+ p1.getNumProducto());
        p1.setPrecio(15);
        p1.setCantidadExistencia(6);
        System.out.println("cantidad de existencia"+p1.getCantidadExistencia());
    }

}