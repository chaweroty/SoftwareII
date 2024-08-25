package SRPII;
import java.util.ArrayList;
import java.util.List;
//Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, esta clase solo se encarga del proceso de almacenas las facturas
public class AlmacenarFactura {
    private List<Factura> facturas = new ArrayList<>();
    public void guardarFactura(Factura factura) {
        facturas.add(factura);
        System.out.println("Factura guardada satisfactoriamente");
    }

    public List<Factura> getFacturas(){
        return facturas;
    }
}
