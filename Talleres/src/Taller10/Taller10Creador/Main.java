package Taller10.Taller10Creador;


public class Main {
    public static void main(String[] args) {
        Orden orden = new Orden();

        orden.agregarComputadora("Intel corei5", "Intel graphics", 8);
        orden.agregarComputadora("Intel corei7", "nvidia gtx 1080", 16);
        orden.agregarComputadora("Intel corei9", "NVIDIA GTX 3080", 32);

        orden.mostrarOrden();
    }
}