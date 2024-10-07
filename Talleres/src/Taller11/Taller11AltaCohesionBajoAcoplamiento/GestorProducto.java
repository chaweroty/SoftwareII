package Taller11.Taller11AltaCohesionBajoAcoplamiento;

public class GestorProducto {
    public void crearProducto(Producto producto) {
        System.out.println("Producto creado: " + producto.getNombreProducto());
    }

    public Producto leerProducto(int idProducto) {
        return new Producto(idProducto, "ProductoX", 50.0);
    }

    public void actualizarProducto(Producto producto) {
        System.out.println("Producto actualizado: " + producto.getNombreProducto());
    }

    public void eliminarProducto(int idProducto) {
        System.out.println("Producto eliminado con ID: " + idProducto);
    }
}
