package Taller5LSP;

public class ProductoDigital extends Producto{
    private int tamañoArchivo;

    public ProductoDigital(double precio, String nombre, int cantidad) {
        super(precio, nombre, cantidad);
    }
    public int getTamañoArchivo() {
        return tamañoArchivo;
    }
    @Override
    public double calcularCosto() {
        return this.getCantidad()*this.getPrecio()*this.getTamañoArchivo();
    }
}
