package SRPII;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Factura> facturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Selecciona una opción: ");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Generar Factura");
            System.out.println("3. Enviar Factura por correo");
            System.out.println("4. Generar Reporte de Facturas");
            System.out.println("5. Enviar factura a la DIAN");
            System.out.println("6. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarCliente(clientes, scanner);
                    break;
                case 2:
                    generarFactura(facturas, clientes, scanner);
                    break;
                case 3:
                    enviarFactura(facturas, scanner);
                    break;
                case 4:
                    generarReporteFactura(facturas);
                    break;
                case 5:
                    enviarFacturaDian(facturas, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
        private static void registrarCliente(ArrayList<Cliente> clientes, Scanner scanner){
            System.out.println("Nombre del cliente");
            String nombre = scanner.nextLine();
            System.out.println("Correo personal del cliente");
            String correo = scanner.nextLine();
            System.out.println("Direccion de residencia");
            String direccion = scanner.nextLine();
            System.out.println("Cedula del cliente");
            String cedula = scanner.nextLine();
            System.out.println("Telefono de contacto");
            String telefono = scanner.nextLine();


            Cliente cliente = new Cliente(nombre, correo, direccion, cedula, telefono);
            clientes.add(cliente);
            System.out.println("Registro del cliente satisfactorio");
        }
        private static void generarFactura (ArrayList <Factura> facturas, ArrayList < Cliente > clientes, Scanner
        scanner){
            if (clientes.isEmpty()) {
                System.out.println("No hay clientes registrados");
                return;
            }
            System.out.println("Ingrese la cedula del cliente");
            String cedula = scanner.nextLine();

            Cliente cliente = null;
            for (Cliente c : clientes) {
                if (c.getCedula().equals(cedula)) {
                    cliente = c;
                    break;
                }
            }
            if (cliente == null) {
                System.out.println("La cedula que ingresaste no coincide con alguna cedula de nuestros clientes");
                return;
            }
            System.out.println("Ingresa el valor de la factura: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();

            Factura factura = new Factura("2024-08-20", facturas.size() + 1, "Jhon alex", monto, cliente);
            facturas.add(factura);
            System.out.println("Factura generada exitosamente para el cliente:  " + cliente.getNombre() + "venta realizada por: " + factura.getVendedor());
        }

        private static void enviarFactura(ArrayList<Factura> facturas, Scanner scanner){
            if (facturas.isEmpty()) {
                System.out.println("No hay facturas disponibles.");
                return;
            }
            System.out.println("Selecciona la factura que necesitas ");
            for (int i = 0; i < facturas.size(); i++) {
                System.out.println((i + 1) + ". Factura #" + (i + 1) + " - Cliente: " + facturas.get(i).getCliente().getNombre());
            }
            int seleccionFactura = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (seleccionFactura < 1 || seleccionFactura > facturas.size()) {
                System.out.println("Selección no válida.");
                return;
            }
            Factura factura = facturas.get(seleccionFactura - 1);
            Correo email = new Correo();
            email.enviarFactura(factura.getCliente(),factura);
        }
        private static void generarReporteFactura(ArrayList<Factura> facturas){
            if (facturas.isEmpty()) {
                System.out.println("No hay facturas para mostrar.");
                return;
            }
            System.out.println("Reporte de Facturas:");
            for (Factura factura : facturas) {
                System.out.println("Factura #" + (facturas.indexOf(factura) + 1) + " - Cliente: " + factura.getCliente().getNombre() + " - Monto: $" + factura.getValor());
            }
        }
    private static void enviarFacturaDian(ArrayList<Factura> facturas, Scanner scanner) {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas disponibles.");
            return;
        }
        System.out.println("Selecciona la factura que quieres enviar a la DIAN:");
        for (int i = 0; i < facturas.size(); i++) {
            System.out.println((i + 1) + ". Factura #" + (i + 1) + " - Cliente: " + facturas.get(i).getCliente().getNombre());
        }
        int seleccionFactura = scanner.nextInt();
        scanner.nextLine();

        if (seleccionFactura < 1 || seleccionFactura > facturas.size()) {
            System.out.println("Selección no válida.");
            return;
        }
        Factura factura = facturas.get(seleccionFactura - 1);
        Correo email = new Correo();
        email.enviarFacturaDian(factura);
        System.out.println("Factura enviada a la DIAN exitosamente.");
    }


}


