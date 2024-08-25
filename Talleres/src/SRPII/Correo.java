package SRPII;
//Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, esta clase solo se encarga de los correos que se deben enviar, si es a un usuario o a la DIAN
public class Correo {
    public void enviarFactura(Cliente cliente, Factura factura){
        System.out.println("Enviando factura al cliente: " + cliente.getNombre());
        System.out.println("Factura #" + factura.getId() + " enviada al correo: " + cliente.getEmail());
    }
    public void enviarFacturaDian( Factura factura){
        System.out.println("Enviando factura #" + factura.getId() + " a la DIAN.");
    }
}
