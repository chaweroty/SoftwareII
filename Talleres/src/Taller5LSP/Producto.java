package Taller5LSP;

public abstract class Producto {
private String nombre;
private double precio;
private int cantidad;

    public Producto(double precio, String nombre, int cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract double calcularCosto();

}
