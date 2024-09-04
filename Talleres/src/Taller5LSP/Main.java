package Taller5LSP;

public class Main {
public static void main(String[] args) {
        Producto productoFisico1 = new ProductoFisico(40,"GOT",20);
        Producto productoDigital1 = new ProductoDigital(30,"Habitos atomicos",40);
        Producto productoMixto1 = new ProductoMixto(70,"Deja de ser tú",10);
        Inventario inventario = new Inventario();
        inventario.calcular(productoFisico1);
        inventario.calcular(productoDigital1);
        inventario.calcular(productoMixto1);

            System.out.println("El calculo de el producto fisico es: " + productoFisico1);
            System.out.println("El calculo de el producto digital es: " + productoDigital1);
            System.out.println("El calculo de el producto mixto es: " + productoMixto1);

}
}
