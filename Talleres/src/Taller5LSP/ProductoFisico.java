package Taller5LSP;

public class ProductoFisico extends Producto implements Enviar{
private double peso;

    public ProductoFisico(double precio, String nombre, int cantidad) {
        super(precio, nombre, cantidad);
    }


    @Override
    public double calcularCosto() {
        return this.getCantidad()*this.getPrecio()*peso;
    }

    public void enviarPorCorreo(){
        System.out.println("Estoy enviando este producto fisico por correo");
    }
}
