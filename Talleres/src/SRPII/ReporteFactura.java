package SRPII;
import java.util.List;
//Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, esta clase solo se enfoca en  generar  un reporte mensual si es requerido
public class ReporteFactura {
    public void reporteMensual(List<Factura> facturas){
        System.out.println("Reporte mensual de facturación:");
        for (Factura factura : facturas) {
            System.out.println("Factura #" + factura.getId() + " - Cliente: " + factura.getCliente().getNombre() + " - Monto: $" + factura.getValor());
        }
        System.out.println("Estas facturas fueron las que se generaron en este mes");

    }
}
