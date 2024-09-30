package Taller10.Taller10Controlador;

public class Entrada {
    private String tipo;
    private double precio;
    private boolean disponible;

    public Entrada(String tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
