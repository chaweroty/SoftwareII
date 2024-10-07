package Taller11.Taller11FabricaciónPura;

import java.util.Arrays;
import java.util.List;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Airpods", 850000, 1);
        Producto producto2 = new Producto("Apple Watch", 1300000, 3);

        Cliente cliente = new Cliente("Sebastián", "Calle 9A, Manizales, Caldas");

        List<Producto> listaProductos = Arrays.asList(producto1, producto2);
        Pedido pedido = FabricaPedidos.crearPedido(cliente, listaProductos);

        pedido.mostrarDetallesPedido();

    }
}
