package OCPII;
public class CalculoImpuestoSaludable extends Calculo{
    private static final double IVA_SALUDABLE = 0.05;
    public CalculoImpuestoSaludable(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }
    @Override
    public double calculaImpuesto() {
        return cantidad * precio * IVA_SALUDABLE;
    }
}
