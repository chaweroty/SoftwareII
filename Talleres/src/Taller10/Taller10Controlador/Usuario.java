package Taller10.Taller10Controlador;

public class Usuario {
    private ControladorVenta controlador = new ControladorVenta();
    public void comprar(String tipoEntrada) {
        controlador.comprarEntrada(tipoEntrada);
    }
}
