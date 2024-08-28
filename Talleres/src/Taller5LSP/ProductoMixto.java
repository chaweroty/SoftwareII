package Taller5LSP;

public class ProductoMixto extends Producto implements Enviar{
private double peso;
private int tamañoArchivo;

    public ProductoMixto(double precio, String nombre, int cantidad) {
        super(precio, nombre, cantidad);
    }


    @Override
    public double calcularCosto() {
        return peso*tamañoArchivo;
    }


    @Override
    public void enviarPorCorreo() {
        System.out.println("Estoy enviando este producto mixto por correo");

    }
}
