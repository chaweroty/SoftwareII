package Taller16.PatronPrototype;

public class Main {
    public static void main(String[] args) {
        Producto productoOriginal = new Producto("Celular", 2000000, "Electrónico");
        Producto productoClonado = (Producto) productoOriginal.clone();

        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);

        System.out.println("¿Son el mismo objeto? " + (productoOriginal == productoClonado));
    }
}
