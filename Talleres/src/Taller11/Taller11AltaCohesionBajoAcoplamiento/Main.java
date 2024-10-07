package Taller11.Taller11AltaCohesionBajoAcoplamiento;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Sebastián", "Calle 9A");
        Producto prod1 = new Producto(1, "Airpods", 850.000);
        Producto prod2 = new Producto(2, "Apple Watch series 9", 1300000);

        Factura factura = new Factura();
        factura.procesarFactura(cliente, Arrays.asList(prod1, prod2));

        double totalConDescuento = factura.calcularPrecioConDescuento(10);
        System.out.println("Total con descuento: " + totalConDescuento);

        GestorProducto crudProducto = new GestorProducto();
        crudProducto.crearProducto(prod1);
        crudProducto.actualizarProducto(prod2);
    }
}

