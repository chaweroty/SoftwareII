package Taller11.Taller11AltaCohesionBajoAcoplamiento;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto(int idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
}
