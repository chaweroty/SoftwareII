package Taller10.Taller10Experto;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Sorprende a tu mente", "Ana Ibañez", "9789564085319", 87000);
        Libro libro2 = new Libro("Código limpio", "Robert  Cecil Martin", "9788441532106", 228000);
        Libro libro3 = new Libro("Si lo crees, lo creas", "Brian Tracy", "9789585549319", 39000);

        Carrito carrito = new Carrito();

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);
        carrito.agregarLibro(libro2);
        carrito.agregarLibro(libro3);

        System.out.println("Precio total: $" + carrito.calcularPrecioTotal());

        System.out.println(carrito);

        carrito.eliminarLibro(libro2);

        System.out.println("Precio total después de eliminar un libro: " + carrito.calcularPrecioTotal());

        System.out.println(carrito);
    }
}
