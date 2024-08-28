package OCPII;
import SRPII.Factura;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<OCPII.Factura> facturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Holaaaa, bienvenido a cha2Store");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Generar Factura");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    generarFactura(facturas, scanner);
                    break;

                case 2:
                    System.out.println("Adios!");
                    return;
                default:
                    System.out.println("Opcion no valida");


            }
        }
    }
    private static void generarFactura(ArrayList<OCPII.Factura> facturas, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto:");
        String producto = scanner.nextLine();

        System.out.println("Ingrese la cantidad:");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el precio:");
        int precio = scanner.nextInt();

        System.out.println("Seleccione el tipo de impuesto que de deseas que se le agrave a la persona:");
        System.out.println("1. IVA 19%");
        System.out.println("2. ReteIVA 10%");
        System.out.println("3. IVA Saludable 5%");

        int tipoImpuesto = scanner.nextInt();

        Calculo calculo = null;

        switch (tipoImpuesto) {
            case 1:
                calculo = new CalculoImpuestoIva(producto, cantidad, precio);
                break;
            case 2:
                calculo = new CalculoImpuestoReteIva(producto, cantidad, precio);
                break;
            case 3:
                calculo = new CalculoImpuestoSaludable(producto, cantidad, precio);
                break;
            default:
                System.out.println("Tipo de impuesto no válido.");
                return;
        }

        OCPII.Factura factura = new OCPII.Factura();
        double impuesto = factura.calcularImpuesto(calculo);

        System.out.println("El impuesto para " + producto + " es: " + impuesto);
        facturas.add(factura);
    }
}


