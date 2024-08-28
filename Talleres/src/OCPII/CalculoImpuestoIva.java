package OCPII;

public class CalculoImpuestoIva extends Calculo{
    private static final double IVA = 0.19;

    public CalculoImpuestoIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calculaImpuesto() {
        return cantidad * precio * IVA;
    }
}
